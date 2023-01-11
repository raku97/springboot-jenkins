package com.example.springbootjenkinsdemo;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
class SpringbootJenkinsDemoApplicationTests {

	public static Logger logger= LoggerFactory.getLogger(SpringbootJenkinsDemoApplication.class);
	@Test
	void contextLoads() {
	logger.info("test case executing....");
	assertEquals(true,true);

	}

}
