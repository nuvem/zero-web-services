package com.training.statconsumer.main;

import javax.xml.ws.Endpoint;

import com.trainig.statproducer.StatProducer;
import com.trainig.statproducer.StatProducerSOAPPorts;
import com.training.statconsumer.impl.StatConsumerImpl;

public class Main {

	public static void main(String[] args) {
		new Main().run();

	}

	public Main() {
	}

	private void run() {
		System.out.println("Starting Server");
		Object implementor = new StatConsumerImpl();
		String address = "http://localhost:8888/statConsumer/port1";
		Endpoint.publish(address, implementor);
		sendRequest();
	}

	private void sendRequest() {
		StatProducerSOAPPorts ss = new StatProducerSOAPPorts(
				StatProducerSOAPPorts.WSDL_LOCATION,
				StatProducerSOAPPorts.SERVICE);
		StatProducer port = ss.getStatProducerSOAPPort1();

		{
			System.out.println("Invoking getStatistics...");

			port.getStatistics("abc",
					"http://localhost:8888/statConsumer/port1");

		}
	}
}
