package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	private static final Logger log = LoggerFactory.getLogger(DemoApplicationTests.class);


	@Autowired
	private Person person;
	@Test
	public void contextLoads() {
		System.out.println(person);
		log.trace("trace 1234");
		log.debug("debug 1234");
		log.info("info 1234");
		log.warn("warn 1234");
		log.error("error 1234");
	}

}
