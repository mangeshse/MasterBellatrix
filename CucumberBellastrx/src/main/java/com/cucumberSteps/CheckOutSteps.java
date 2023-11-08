package com.cucumberSteps;

import com.basesetup.KeyWord;
import com.config.Configuration;
import com.pages.CheckOutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CheckOutSteps {
	KeyWord key = new KeyWord();
	Configuration con = new Configuration();
	CheckOutPage check = new CheckOutPage();

	@Given("launch application")
	public void url() {
		key.launchUrl(con.getAppUrl("beta"));
	}

	@When("Enter valid product click on home button")
	public void addProduct() throws InterruptedException {
		check.clickHome();
	}

}
