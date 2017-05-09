package com.warrengreen.domain;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTests {

	private static final Logger log = LoggerFactory.getLogger(JsonTests.class);
	@Test
	public void biDirectionalTest() throws JsonProcessingException {
		
		User user = new User();
		user.setId(1);
		user.setName("Warren");
		Address address = new Address(1,6,"Rocklyn Lane","BT210FL");
		user.addAddress(address);
		address.setOwner(user);
		log.info("User {}",user);
		
		
		String result = new ObjectMapper().writeValueAsString(user);
		log.info("User {}",result);
		result = new ObjectMapper().writeValueAsString(address);
		log.info("Address {}",result);
	}

}
