package com.trainig.statproducer.impl;

import java.util.concurrent.BlockingQueue;

import javax.jws.WebService;

import com.trainig.statproducer.StatProducer;

@WebService(endpointInterface = "com.trainig.statproducer.StatProducer")
public class StatProducerImpl implements StatProducer {

	private final BlockingQueue<String> queue;

	public StatProducerImpl(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void getStatistics(String parameters) {
		this.queue.add(parameters);
	}

}
