package com.training.statconsumer.impl;

import javax.jws.WebService;

import com.training.statconsumer.StatConsumer;

@WebService(endpointInterface = "com.training.statconsumer.StatConsumer")
public class StatConsumerImpl implements StatConsumer {

	@Override
	public void putStatistics(String parameters) {
		System.out.println("Got response:" + parameters);

	}

}
