package com.training.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;

import com.trainig.statproducer.impl.StatProducerImpl;
import com.training.statconsumer.StatConsumer;
import com.training.statconsumer.StatConsumerPorts;

public class StatProducerMain {

	private BlockingQueue<String> requestQueue;

	public static void main(String[] args) {
		new StatProducerMain().run();
	}

	public StatProducerMain() {
		this.requestQueue = new LinkedBlockingDeque<String>();
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
				String req = requestQueue.take();
				System.out.println("Got a request: " + req);
				System.out.println("Enter response: ");
				String result = br.readLine();

				StatConsumerPorts ports = new StatConsumerPorts(
						StatConsumerPorts.WSDL_LOCATION, new QName(
								"http://www.training.com/StatConsumer/",
								"StatConsumerPorts"));
				StatConsumer statConsumerClient = ports.getStatConsumerSOAPPort1();
				statConsumerClient.putStatistics(result);

			} catch (InterruptedException | IOException e) {
				e.printStackTrace();
				continue;
			}
		}
	}
}
