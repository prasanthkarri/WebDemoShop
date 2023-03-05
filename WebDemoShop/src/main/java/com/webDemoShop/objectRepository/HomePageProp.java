package com.webDemoShop.objectRepository;

import org.openqa.selenium.By;

public interface HomePageProp {

	By VERIFY_EMAIL = By.xpath("//div[@class='header-links']/descendant::a[@class='account']");
	By JEWERLY = By.xpath("//div[@class='header-menu']//li[6]/a");
	
	
	By ADDWISHLIST_BTN = By.xpath("//input[@value='Add to wishlist']");
	By WISHLIST_LSIT =By.xpath("//a[@class='ico-wishlist']");

}
