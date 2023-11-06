package com.cucumberSteps;

import org.checkerframework.checker.units.qual.h;

import com.basesetup.KeyWord;
import com.config.Configuration;
import com.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	KeyWord key = new KeyWord();
	Configuration con = new Configuration();
	HomePage home = new HomePage();

	@Given("Launched application")
	public void openUrl() {
		key.launchUrl(con.getAppUrl("beta"));

	}

	@When("Click on Home page")
	public void clickOnHomePage() {
		home.homePage();
	}

	@Then("Verify all the product name")
	public void listOfAllProduct() {
		home.listOfProducts();

	}

	@Given("Launched application url")
	public void openAppUrl() {
		key.launchUrl(con.getAppUrl("beta"));

	}

	@When("Click on default sorting drop down list")
	public void DefaultSortingDrowpDownList() {
		home.drowpDownListOfAllProuct();

	}

//	@Then("Verify all the default sorting product")
//	public void defaultSortingLists() {
//		home.getdefaultProductList();
//
//	}

}
