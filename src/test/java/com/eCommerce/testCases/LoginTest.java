package com.eCommerce.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.eCommerce.pageObjects.LoginPage;

public class LoginTest extends BaseClass {

	static BaseClass bc;
	static LoginPage lp;

	@Test(priority = 1)
	public static void loginTest() {

		driver.get(bc.url);

		logger.info("url is launched");

		lp = new LoginPage(driver);

		lp.setUserName(bc.username);
		lp.setPassword(bc.password);

		lp.loginBtn();

	}

	@Test(priority = 2)
	public static void logOutTest() throws InterruptedException {

		if (driver.getTitle().equalsIgnoreCase("https://admin-demo.nopcommerce.com/admin/")) {

			System.out.println("its  valid url");

			lp.logout();

			Thread.sleep(2000);

		}
	}

}
