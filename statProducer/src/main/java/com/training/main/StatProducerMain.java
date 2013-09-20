package com.training.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Endpoint;

import com.trainig.statproducer.GetStatistics;
import com.trainig.statproducer.impl.StatProducerImpl;
import com.training.statconsumer.StatConsumer;
import com.training.statconsumer.StatConsumerPorts;

public class StatProducerMain {

	private BlockingQueue<GetStatistics> requestQueue;

	public static void main(String[] args) {
		new StatProducerMain().run();
	}

	public StatProducerMain() {
		this.requestQueue = new LinkedBlockingDeque<GetStatistics>();
	}

	private void run() {
		System.out.println("Starting Server");
		Object implementor = new StatProducerImpl(this.requestQueue);
		String address = "http://localhost:8080/statProducer/port1";
		Endpoint.publish(address, implementor);
		processRequest();
	}

	private void processRequest() {
		System.out.println("Waiting for a request...");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {

			try {
				GetStatistics req = requestQueue.take();
				System.out.println("Got a request: " + req.getParam());
				System.out.println("Enter response: ");
				String result = br.readLine();

				StatConsumerPorts ports = new StatConsumerPorts(
						StatConsumerPorts.WSDL_LOCATION, new QName(
								"http://www.training.com/StatConsumer/",
								"StatConsumerPorts"));

				StatConsumer port1 = ports.getStatConsumerSOAPPort1();
				BindingProvider bindingProvider = (BindingProvider) port1;
				bindingProvider.getRequestContext().put(
						BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
						req.getReplyto());

				port1.putStatistics(result);

			} catch (InterruptedException | IOException e) {
				e.printStackTrace();
				continue;
			}
		}
	}
}
