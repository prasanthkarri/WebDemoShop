package com.webDemoShop.register;

import org.openqa.selenium.WebDriver;

import com.webDemoShop.objectRepository.RegisterPageProp;
import com.webDemoShop.register.results.RegisterResultPage;
import com.webDemoShop.utils.WebDriverUtils;

public class RegisterPage extends WebDriverUtils implements RegisterPageProp {
WebDriver driver;
	public RegisterPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	public void fillRegisterForm(String gender,String firstName, String lastName, String email, String password,String confirmPassword) {
		isDisplayed(REGISTER_LABEL);
		if(gender=="male") {
			click(GENDER_MALE_RADIAL_BTN);
		}else
		{
			//need to implement click on female radial button
		}
		
		enterText(FIRST_NAME, firstName);
		enterText(LAST_NAME, lastName);
		enterText(EMAIL, email);
		enterText(PASSWORD, password);
		enterText(CONFIRM_PASSWORD, confirmPassword);
		
	}
	public RegisterResultPage clickOnRegister() {
		click(REGISTER_BUTTON);
		return new RegisterResultPage(driver);
	}
	

}
