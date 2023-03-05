package stepDefinations;

import io.cucumber.java.en.And;

public class WishListStepDef {
	
	Steps steps;

	public WishListStepDef(Steps steps) {
		this.steps = steps;

}
	
	@And("Verify able to see respective item")
	public void verifyWishList() {
		steps.wishlistpage = steps.wishlistpage.verifyWishListSection();
	}
	
	
	
}