package stepDefinations;



import com.webDemoShop.basePage.BasePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class BasePageStepDef {
	Steps steps;
	public BasePageStepDef(Steps steps) {
		this.steps=steps;
		 steps.basepage=new BasePage();
	}
	@Given("user launch browser")
	public void user_launch_browser() {
		steps.basepage.intilizeDriver();
	}
	@When("user enters url")
	public void user_enters_url() {
		steps.landingpage=steps.basepage.enterURL();
	}
	

}
