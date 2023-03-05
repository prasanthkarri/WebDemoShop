package stepDefinations;

import java.util.Map;

import io.cucumber.java.en.And;

public class RegistrationPageStepDef {
	Steps steps;

	public RegistrationPageStepDef(Steps steps) {
		this.steps = steps;
	}

	@And("user filled the registration form")
	public void fillregisterForm(Map<String, String> dataFromFeatureFileStep) {
		String gender = dataFromFeatureFileStep.get("gender");
		String firstName = dataFromFeatureFileStep.get("firstName");
		String lastName = dataFromFeatureFileStep.get("lastName");
		
		String email = dataFromFeatureFileStep.get("email");
		String password = dataFromFeatureFileStep.get("password");
		String confirmPassword = dataFromFeatureFileStep.get("confirmPassword");
		steps.registerpage.fillRegisterForm(gender, firstName, lastName, email, password,confirmPassword);
	}

	@And("user click on register button")
	public void clickOnRegisterBtn() {
		steps.regesterResultspage = steps.registerpage.clickOnRegister();
	}

}
