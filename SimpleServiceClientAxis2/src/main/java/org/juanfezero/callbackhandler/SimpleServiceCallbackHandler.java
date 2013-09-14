package org.juanfezero.callbackhandler;

import com.ttdev.ss.SimpleServiceStub.ConcatResponse;


public class SimpleServiceCallbackHandler extends com.ttdev.ss.SimpleServiceCallbackHandler {
	
	private ConcatResponse concatResponse;
	
	@Override
	public void receiveResultconcat(ConcatResponse result) {
		this.concatResponse = result;
	}
	
	public ConcatResponse getResponse() {
		return this.concatResponse;
	}
}
