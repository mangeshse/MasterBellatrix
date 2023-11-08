package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cucumberSteps.BaseClass;

public class CartPage {
	public CartPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(css = "ul[class='nav-menu'] li[class='page_item page-item-6 current_page_item']")
	WebElement carttab;
	@FindBy(css = ".cart-empty.woocommerce-info")
	WebElement cartEmptytext;
	@FindBy(css = ".button.wc-backward")
	WebElement returnToShop;
	@FindBy(css = "a[aria-label='Add “Falcon 9” to your cart']")
	WebElement addToCartButton;
	@FindBy(xpath = "//*[@id=\"main\"]/ul/li[1]/a[3]")
	WebElement viewCart;
	@FindBy(css = "table[class='shop_table shop_table_responsive cart woocommerce-cart-form__contents'] thead")
	WebElement cartProductContaint;

	public void cartPageDetails() {
		carttab.click();

	}

	public void verifyEmptyCardText() {
		System.out.println(cartEmptytext.getText());
		String actualResult = cartEmptytext.getText();
		String expectedResult = "Your cart is currently empty.";
		Assert.assertEquals(actualResult, expectedResult);

	}

	public void returnToShoppProduct() {
		returnToShop.click();
		System.out.println(BaseClass.getDriver().getTitle());

	}

}
