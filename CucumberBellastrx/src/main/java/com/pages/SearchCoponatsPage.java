package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.basesetup.KeyWord;
import com.cucumberSteps.BaseClass;

public class SearchCoponatsPage {
	public SearchCoponatsPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(css = "#woocommerce-product-search-field-0")
	WebElement searchCoponats;
	@FindBy(css = "p.woocommerce-info")
	WebElement invalidProductSelectionInfo;
	@FindBy(css = "h2.woocommerce-loop-product__title")
	WebElement falconProducts;

	public void searchFalcon() {
		searchCoponats.click();
		searchCoponats.sendKeys("falcon");
		searchCoponats.sendKeys(Keys.ENTER);
		List<WebElement> falconPro = BaseClass.getDriver()
				.findElements(By.cssSelector("h2.woocommerce-loop-product__title"));
		for (WebElement webElement : falconPro) {
				System.out.println(webElement.getText());
			}

		}

	public void searchInvalidProduct() {
		searchCoponats.click();
		searchCoponats.sendKeys("djshgcb");
		searchCoponats.sendKeys(Keys.RETURN);
	}

	public void getInvalidProductText() {
		WebElement element = BaseClass.getDriver().findElement(By.cssSelector(".woocommerce-info"));
		System.out.println(element.getText());
	}
}
