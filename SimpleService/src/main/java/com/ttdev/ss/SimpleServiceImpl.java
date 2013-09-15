package com.ttdev.ss;

public class SimpleServiceImpl implements SimpleService {

	@Override
	public String concat(String s1, String s2) {
		return s1 + s2;
	}

}
