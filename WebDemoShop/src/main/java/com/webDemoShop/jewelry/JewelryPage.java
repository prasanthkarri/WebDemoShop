package com.webDemoShop.jewelry;

import org.openqa.selenium.WebDriver;

import com.webDemoShop.objectRepository.JewelryPageProp;
import com.webDemoShop.utils.WebDriverUtils;

public class JewelryPage extends WebDriverUtils implements JewelryPageProp {
	WebDriver driver;

	public JewelryPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public JewerlyDetailsPage selectItem() {
		click(JEWERLY_PRODUCT);
		return new JewerlyDetailsPage(driver);

	}
	
	

}
