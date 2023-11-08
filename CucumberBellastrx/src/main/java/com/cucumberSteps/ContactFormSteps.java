package com.cucumberSteps;

import com.basesetup.KeyWord;
import com.config.Configuration;
import com.pages.ContactFormPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactFormSteps {
	KeyWord key = new KeyWord();
	Configuration con = new Configuration();
	ContactFormPage conpage = new ContactFormPage();

	@Given("Launched application 1")
	public void applicationUrl() {
		key.launchUrl(con.getAppUrl("beta"));
	}

	@When("Enter all valid details")
	public void validContactDetails() {
		conpage.ContactDetails();

	}

	@Given("Launched application 2")
	public void applicationUrl2() {
		key.launchUrl(con.getAppUrl("beta"));
	}

	@When("Enter all invalid details")
	public void invalidContactDetails() {
		conpage.InvalidContactDetails();
	}

	@Given("Launched application 3")
	public void applicationUrl3() {
		key.launchUrl(con.getAppUrl("beta"));

	}

	@When("click on submit button")
	public void blankContactFormAndSubmit() {
		conpage.BlankForm();

	}

	@Then("verify error text message")
	public void getBlankContactFormErrorText() {
		conpage.getTextError();

	}

	@Given("Launched application 5")
	public void applicationUrl4() {
		key.launchUrl(con.getAppUrl("beta"));
	}

	@When("Enter invalid email id in the email field")
	public void invalidEmail() {
		conpage.invalidEmailId();
	}

	@Then("Contact Form should not get submitted")
	public void idNotSubmitted() {
		conpage.getTextError();

	}
}
