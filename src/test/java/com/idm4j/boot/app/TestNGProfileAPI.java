package com.idm4j.boot.app;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.idm4j.boot.app.web.api.ProfileAPI;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestNGProfileAPI {

	private static final Logger logger = LoggerFactory.getLogger(TestNGProfileAPI.class);
	public TestNGProfileAPI() {
		// TODO Auto-generated constructor stub
	}
	
	@BeforeSuite
	public void bootup(){
		logger.info("Boot UP - Start");
		logger.info("Boot UP - End");
		
	}
	
	@Test(priority=1)
   public void validateSave(){
			logger.info("ValidateSave UP - Start");
			
			logger.info("ValidateSave UP - End");
	 }
	
	
	@AfterSuite
	public void cleanup(){
		logger.info("Clean Up - Start");
		logger.info("Clean Up - End");
	}
}
