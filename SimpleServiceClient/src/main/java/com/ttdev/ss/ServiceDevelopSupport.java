package com.ttdev.ss;

public class ServiceDevelopSupport {

	public static ConcatRequest createConcatRequest() {
		ConcatRequest concatRequest = new ConcatRequest();
		concatRequest.setS1("hola ");
		concatRequest.setS2("caracola");
		return concatRequest;
	}

}
