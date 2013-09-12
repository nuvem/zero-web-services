package com.ttdev.ss;

public class SimpleServiceImpl implements SimpleService {

	@Override
	public String concat(ConcatRequest concatRequest) {
		String response = concatRequest.getS1().concat(concatRequest.getS2());
		return response;
	}

}
