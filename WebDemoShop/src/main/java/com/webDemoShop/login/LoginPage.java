package com.webDemoShop.login;

import org.openqa.selenium.WebDriver;

import com.webDemoShop.objectRepository.LoginPageProp;
import com.webDemoShop.utils.WebDriverUtils;

public class LoginPage extends WebDriverUtils implements LoginPageProp {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
/*
	public LoginPage clickOnLoginBtn() {

		click(LOGIN_LINK);

		return new LoginPage(driver);
	}*/

	public void EnterCred(String email, String password) {

		enterText(LOGIN_EMAIL, email);
		enterText(LOGIN_PWD, password);
		
	}

	public HomePage clickOnLogin() {
		click(LOGIN_BTN);
		return new HomePage(driver);
	}

}
