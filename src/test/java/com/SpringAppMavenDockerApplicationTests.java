package com;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringAppMavenDockerApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringAppMavenDockerApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info("Test case executing");
		assert(true);
	}

}
