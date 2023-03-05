package com.webDemoShop.login;

import org.openqa.selenium.WebDriver;

import com.webDemoShop.jewelry.JewelryPage;
import com.webDemoShop.objectRepository.HomePageProp;
import com.webDemoShop.utils.WebDriverUtils;

public class HomePage extends WebDriverUtils implements HomePageProp {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public JewelryPage clickOnJewelryTab() {
		click(JEWERLY);
		return new JewelryPage(driver);
	}

}
