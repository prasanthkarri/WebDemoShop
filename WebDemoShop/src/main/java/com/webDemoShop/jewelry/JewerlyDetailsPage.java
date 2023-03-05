package com.webDemoShop.jewelry;

import org.openqa.selenium.WebDriver;

import com.webDemoShop.objectRepository.JewerlyDetailsPageProp;
import com.webDemoShop.utils.WebDriverUtils;
import com.webDemoShop.wishList.WishListPage;

public class JewerlyDetailsPage extends WebDriverUtils implements JewerlyDetailsPageProp {
	WebDriver driver;

	public JewerlyDetailsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	public JewerlyDetailsPage addToWishList() {
		click(ADD_TO_WISHLIST_BUTTON);
		return new JewerlyDetailsPage(driver);
	}

	public JewerlyDetailsPage successMessage() {
		System.out.println(isDisplayed(VERIFY_SUCCESS_MESSAGE));
		System.out.println(getText(VERIFY_SUCCESS_MESSAGE));
		return new JewerlyDetailsPage(driver);
		
	}
	
	public WishListPage ClickWishLink() {
		click(WISHLIST_LSIT_LINK);
		return new WishListPage(driver);
	}
	
}
