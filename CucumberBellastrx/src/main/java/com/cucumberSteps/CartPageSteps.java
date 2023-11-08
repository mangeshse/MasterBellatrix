package com.cucumberSteps;

import com.basesetup.KeyWord;
import com.config.Configuration;
import com.pages.CartPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartPageSteps {
	KeyWord key = new KeyWord();
	Configuration con = new Configuration();
	CartPage cart = new CartPage();

	@Given("Launch cart page url")
	public void openUrl() {
		key.launchUrl(con.getAppUrl("cart"));

	}

	@When("Click on cart tab")
	public void cardTab() {
		cart.cartPageDetails();

	}

	@Then("Verify empty card text")
	public void verifyEmptyCard() {
		cart.verifyEmptyCardText();
	}

	@Given("Launch cart page url1")
	public void openCartUrl() {
		key.launchUrl(con.getAppUrl("cart"));

	}

	@When("Click on return to shop button")
	public void returnToShop() {
		cart.returnToShoppProduct();

	}

	@Then("Verify all product")
	public void verifyAllProduct() {
		BaseClass.driver.getCurrentUrl();

	}

}
