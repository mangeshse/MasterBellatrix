package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberSteps.BaseClass;

public class CheckOutPage {
	public CheckOutPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(css = ".checkout-button.button.alt.wc-forward")
	WebElement checkOut;
	@FindBy(css = "#woocommerce-product-search-field-0")
	WebElement searchCoponats;
	@FindBy(css = "a[aria-label='Add “Falcon 9” to your cart']")
	WebElement addToCartButton;
	@FindBy(css = "#site-navigation > div:nth-child(2) > ul > li.page_item.page-item-6.focus > a")
	WebElement cartTab;
	@FindBy(css = "ul[class='nav-menu'] li[class='current_page_item'] a")
	WebElement homeTab;
	
	

	public void clickHome() throws InterruptedException {
		homeTab.click();
		addToCartButton.click();
		Thread.sleep(4000);
		cartTab.click();
		
	}

	public void billingDetalis() {

	}
}
