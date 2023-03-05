package stepDefinations;

import io.cucumber.java.en.And;

public class JewelryPageStepDef {
	
	Steps steps;

	public JewelryPageStepDef(Steps steps) {
		this.steps = steps;

	}
	@And("User selects an item")
	public void selectItem() {
		steps.jewelryDetailsPage=steps.jewelrypage.selectItem();
	}
	@And("user is able to add that item into Add to WishList")
	public void addToWishList() {
		steps.jewelryDetailsPage=steps.jewelryDetailsPage.addToWishList();
		steps.jewelryDetailsPage=steps.jewelryDetailsPage.successMessage();
		
		
	}
	
	@And("User Navigates to Wishlist section")
	public void ClickWishLink() {
		steps.wishlistpage=steps.jewelryDetailsPage.ClickWishLink();
		
}
}
