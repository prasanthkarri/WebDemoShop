package stepDefinations;

import io.cucumber.java.en.And;

public class LogoutPageStepDef {
	Steps steps;
	public LogoutPageStepDef(Steps steps) {
		this.steps=steps;
	}
	@And("Logout")
	public void logout() {
		steps.basepage.closeBrowser();
	}

}
