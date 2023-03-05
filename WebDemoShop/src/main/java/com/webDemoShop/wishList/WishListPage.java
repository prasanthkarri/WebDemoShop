package com.webDemoShop.wishList;

import org.openqa.selenium.WebDriver;

import com.webDemoShop.objectRepository.WishlistPageProp;
import com.webDemoShop.utils.WebDriverUtils;

public class WishListPage extends WebDriverUtils implements WishlistPageProp {
	WebDriver driver;

	public WishListPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public WishListPage verifyWishListSection() {
		getText(WISHLIST_SECTION);
		return new WishListPage(driver);
	}

}