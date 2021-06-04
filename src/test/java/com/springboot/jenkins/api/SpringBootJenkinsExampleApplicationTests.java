package com.springboot.jenkins.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJenkinsExampleApplicationTests {
	public static Logger logger = (Logger) LoggerFactory.getLogger(SpringBootJenkinsExampleApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test Case Executing");
		assertEquals(true, true);
	}

}
