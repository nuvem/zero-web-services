package com.trainig.statproducer.impl;

import java.util.Queue;

import javax.jws.WebService;

import com.trainig.statproducer.GetStatistics;
import com.trainig.statproducer.StatProducer;

@WebService(endpointInterface = "com.trainig.statproducer.StatProducer")
public class StatProducerImpl implements StatProducer {

	private Queue<GetStatistics> statRequestQueue;

	public StatProducerImpl(Queue<GetStatistics> statRequestQueue) {
		this.statRequestQueue = statRequestQueue;
	}

	@Override
	public void getStatistics(String param, String replyto) {
		GetStatistics req = new GetStatistics();
		req.setParam(param);
		req.setReplyto(replyto);
		statRequestQueue.add(req);

	}
}
