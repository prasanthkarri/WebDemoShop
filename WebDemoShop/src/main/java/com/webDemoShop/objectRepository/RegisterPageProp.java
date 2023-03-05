package com.webDemoShop.objectRepository;

import org.openqa.selenium.By;

public interface RegisterPageProp {
	By REGISTER_LABEL = By.xpath("//div[@class='page-title']");
	By GENDER_MALE_RADIAL_BTN = By.xpath("//input[@id='gender-male']");
	By FIRST_NAME = By.xpath("//input[@id='FirstName']");
	By LAST_NAME= By.xpath("//input[@id='LastName']");
	By EMAIL = By.xpath("//input[@id='Email']");
	By PASSWORD = By.xpath("//input[@id='Password']");
	By CONFIRM_PASSWORD = By.xpath("//input[@id='ConfirmPassword']");
	By REGISTER_BUTTON = By.xpath("//input[@value='Register']");
	By LOGIN_LABEL= By.xpath("//h1[text()='Welcome, Please Sign In!']");
	By LOGIN_EMAIL=By.xpath("//input[@class='email']");
	By LOGIN_PASSWORD= By.xpath("//input[@class='password']");
	By LOGIN_BUTTON= By.xpath("//input[@value='Log in']");
	

}
