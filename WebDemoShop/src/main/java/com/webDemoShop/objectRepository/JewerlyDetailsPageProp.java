package com.webDemoShop.objectRepository;

import org.openqa.selenium.By;

public interface JewerlyDetailsPageProp {
	
	By SELECTED_JEWERLY = By.xpath("//a[@title='Show details for Black & White Diamond Heart']");
	By ADD_TO_WISHLIST_BUTTON = By.xpath("//input[@value='Add to wishlist']");
	By VERIFY_SUCCESS_MESSAGE= By.xpath("//p[@class='content']");
	By WISHLIST_LSIT_LINK =By.xpath("//a[@class='ico-wishlist']/descendant::span[@class='cart-label']");

}
