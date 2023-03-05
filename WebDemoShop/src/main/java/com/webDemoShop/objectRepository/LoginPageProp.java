package com.webDemoShop.objectRepository;

import org.openqa.selenium.By;

public interface LoginPageProp {
	
	By 	LOGIN_LINK=By.xpath("//a[@class='ico-login']");
	By LOGIN_EMAIL=By.xpath("//input[@class='email']");
	By LOGIN_PWD=By.xpath("//input[@class='password']");
	By LOGIN_BTN=By.xpath("//input[@value='Log in']");
	
	
	

}
