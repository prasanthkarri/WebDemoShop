package com.webDemoShop.objectRepository;

import org.openqa.selenium.By;

public interface LandingPageProp {
	By 	LOGIN_LINK=By.xpath("//a[@class='ico-login']");
	By 	EMAIL_TEXT_FIELD=By.xpath("//input[@class='email']");
	By 	PASSWPRD_TEXT_BOX=By.xpath("//input[@class='password']']");
	By LOGIN_BTN = By.xpath("//input[@value='Log in']");
	By REGISTER_BTN = By.xpath("//a[text()='Register']");
	
	
}
