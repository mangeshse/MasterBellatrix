package com.cucumberSteps;

import java.util.List;

import org.openqa.selenium.By;

import com.basesetup.KeyWord;
import com.config.Configuration;
import com.pages.SearchCoponatsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductSteps {
	KeyWord key = new KeyWord();
	Configuration con = new Configuration();
	SearchCoponatsPage page = new SearchCoponatsPage();
	@Given("Application is launched completely")
	public void openAppUrl() {
		key.launchUrl(con.getAppUrl("beta"));
		
	}
	@When("User searches falcon in search component and get product title")
	public void searchFalcon() {
		page.searchFalcon();
		
		
	}
	@Given("Application is launched")
	public void urlOpen() {
		key.launchUrl(con.getAppUrl("beta"));
	}
	@When("User searches invalid in search component")
	public void searchInvalidProduct() {
		page.searchInvalidProduct();
	}
	@Then("Verify get text")
	public void getSearchResult() {
		page.getInvalidProductText();
	}
	
	
}
