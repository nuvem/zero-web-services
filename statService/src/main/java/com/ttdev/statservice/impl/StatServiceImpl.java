package com.ttdev.statservice.impl;

import java.util.concurrent.Future;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

import com.ttdev.statservice.StatService;

public class StatServiceImpl implements StatService {
	@Override
	public String getStatistics(String parameters) {
		try {
			Thread.sleep(3000);
			return parameters.toUpperCase();

		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public Response<String> getStatisticsAsync(String parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<?> getStatisticsAsync(String parameters,
			AsyncHandler<String> asyncHandler) {
		// TODO Auto-generated method stub
		return null;
	}

}
