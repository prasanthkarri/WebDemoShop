package stepDefinations;

import java.util.HashMap;
import java.util.Map;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class LoginPageStepDef {
	Steps steps;

	public LoginPageStepDef(Steps steps) {
		this.steps = steps;

	}

	@And("User able to enter his credentials")
	public void EnterCred(Map<String, String> dataFromFeatureFileStep) {
		String email = dataFromFeatureFileStep.get("email");
		String password = dataFromFeatureFileStep.get("password");
		steps.loginpage.EnterCred(email, password);
	}
	@And("Verify user able to login successfully")
	public void clickonLoginBtn() {
		steps.homepage= steps.loginpage.clickOnLogin();
	}

}
