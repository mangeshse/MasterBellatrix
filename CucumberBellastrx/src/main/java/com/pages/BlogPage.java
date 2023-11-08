package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberSteps.BaseClass;

public class BlogPage {
	public BlogPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(css = "ul[class='nav-menu'] li[class='page_item page-item-17 '] a")
	WebElement blogs;
	@FindBy(css="article[id='post-36'] span[class='post-author'] a")
	WebElement author;
	
	public void blogDetails() {
		blogs.click();

	}
	public void authorName() {
	WebElement author=BaseClass.getDriver().findElement(By.cssSelector("article[id='post-36'] span[class='post-author'] a"));
	System.out.println(author.getText());
	}
}