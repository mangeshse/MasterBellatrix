package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cucumberSteps.BaseClass;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(css = "ul[class='nav-menu'] li[class='current_page_item'] a")
	WebElement home;
	@FindBy(css = "#main > div:nth-child(2) > form > select")
	WebElement listOfProductDrowpDownList;

	public void homePage() {
		home.click();
	}

	public void listOfProducts() {
		List<WebElement> list = BaseClass.getDriver()
				.findElements(By.cssSelector("h2.woocommerce-loop-product__title"));
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
		}

	}

	public void drowpDownListOfAllProuct() {
		listOfProductDrowpDownList.click();
		System.out.println(listOfProductDrowpDownList.getText());

	}

//	public void getdefaultProductList() {
//		List<WebElement> list = BaseClass.getDriver()
//				.findElements(By.cssSelector("h2.woocommerce-loop-product__title"));
//		for (WebElement webElement : list) {
//			System.out.println(webElement.getText());
//		}

}
