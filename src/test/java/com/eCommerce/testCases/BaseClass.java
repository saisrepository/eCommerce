package com.eCommerce.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.eCommerce.utilites.ReadConfig;

public class BaseClass {
	
	public static WebDriver driver;
	
	
	ReadConfig rc = new ReadConfig();
	
	public String url = rc.getApplicationUrl();
	public String username = rc.getUserName();
	public String password = rc.getPassword();
	

	
	public static Logger logger ;

	@BeforeClass
	public static void setup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gnana\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		logger = Logger.getLogger("CommerceApplication");
		
		PropertyConfigurator.configure("Log4j.properties");
		

	}
	
	@AfterClass
	public static void tearDown() {
		
		driver.close();
		
	}
	


}
