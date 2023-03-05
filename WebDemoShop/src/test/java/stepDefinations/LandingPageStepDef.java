package stepDefinations;

import com.webDemoShop.login.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class LandingPageStepDef {

	Steps steps;
	public LandingPageStepDef(Steps steps) {
		this.steps=steps;
	}
	@Given("click on Register button")
	public void clickOnRegisterBtn() {
		steps.registerpage= steps.landingpage.clickOnRegistrationBtn();
	}

	@Given("user clicks on Login button")
	public void clickOnLogin() {
		steps.loginpage= steps.landingpage.clickOnLoginLink();
	}
	
	
}
