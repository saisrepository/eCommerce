package com.eCommerce.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public static WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath = "//input[@id='Email']")
	WebElement txtuserName;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement txtpassword;

	@FindBy(xpath = "//button[text()='Log in']")
	WebElement btnlogin;
	
	@FindBy(linkText="Logout")
	WebElement btnlogout;

	public void login() throws InterruptedException {

		txtuserName.clear();
		txtpassword.clear();

		Thread.sleep(2000);

		txtuserName.sendKeys("admin@yourstore.com");
		txtpassword.sendKeys("admin");

		btnlogin.click();
	}

	public void setUserName(String uName) {

		txtuserName.clear();
		txtuserName.sendKeys(uName);
	}

	public void setPassword(String password) {

		this.txtpassword.clear();
		this.txtpassword.sendKeys(password);
	}

	public void loginBtn() {

		btnlogin.click();

	}
	
	public void logout() {
		btnlogout.click();
	}

}
