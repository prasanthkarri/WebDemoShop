package com.webDemoShop.landing;

import org.openqa.selenium.WebDriver;

import com.webDemoShop.login.LoginPage;
import com.webDemoShop.objectRepository.LandingPageProp;
import com.webDemoShop.register.RegisterPage;
import com.webDemoShop.utils.WebDriverUtils;

public class LandingPage extends WebDriverUtils implements LandingPageProp{
WebDriver driver;
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	public RegisterPage clickOnRegistrationBtn() {
	click(REGISTER_BTN);
	return new RegisterPage(driver);
	}
	public LoginPage clickOnLoginLink() {
		click(LOGIN_LINK);
		return new LoginPage(driver);
		}
	
	
}
