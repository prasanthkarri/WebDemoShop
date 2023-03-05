package com.webDemoShop.register.results;

import org.openqa.selenium.WebDriver;

import com.webDemoShop.objectRepository.RegisterResultPageProp;
import com.webDemoShop.utils.WebDriverUtils;

public class RegisterResultPage extends WebDriverUtils implements RegisterResultPageProp{
	
	WebDriver driver;
	public RegisterResultPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	public String verifyRegesterSuccess() {
		return getText(REGISTRATION_COMPLETE_LABEL);
	}
	

}
