package com.cucumberSteps;

import com.basesetup.KeyWord;
import com.config.Configuration;
import com.pages.BlogPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BlogSteps {
	KeyWord key = new KeyWord();
	Configuration con = new Configuration();
	BlogPage blog = new BlogPage();

	@Given("Launched application 4")
	public void applicationUr4() {
		key.launchUrl(con.getAppUrl("beta"));

	}

	@When("Click on blog tab")
	public void clickonblogtab() {
		blog.blogDetails();


	}
	@Then("Verify get author name")
	public void getAuthorName() {
		blog.authorName();
	}

}

