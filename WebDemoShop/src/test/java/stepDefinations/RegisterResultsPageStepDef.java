package stepDefinations;

import org.junit.Assert;

import io.cucumber.java.en.And;

public class RegisterResultsPageStepDef {
	Steps steps;
	public RegisterResultsPageStepDef(Steps steps) {
		this.steps=steps;
	}
	@And("verify success message")
	public void fillregisterForm() {
		String actualMessage = steps.regesterResultspage.verifyRegesterSuccess();
		String expectedMessage = "Your registration completed";
		System.out.println("actualMessage : "+actualMessage);
		System.out.println("expectedMessage : "+expectedMessage);
		Assert.assertEquals(actualMessage, expectedMessage);
	}

}
