package stepDefinations;

import io.cucumber.java.en.And;

public class HomePageStepDef {
	Steps steps;

	public HomePageStepDef(Steps steps) {
		this.steps = steps;

	}
	@And("User navigates to jewerly option")
	public void clickOnJewerlyTab() {
		steps.jewelrypage = steps.homepage.clickOnJewelryTab();
	}

}
