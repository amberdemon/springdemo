package com.warrengreen.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class JsonTests {

	@Test
	public void biDirectionalTest() {
		
		User user = new User();
		user.setId(1);
		user.setName("Warren");
		Address address = new Address(1,6,"Rocklyn Lane","BT210FL");
		user.addAddress(address);
	}

}
