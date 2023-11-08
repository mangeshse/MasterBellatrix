package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberSteps.BaseClass;

public class ContactFormPage {

	public ContactFormPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);

	}

	@FindBy(css = "#site-navigation > div:first-of-type > ul > li:nth-of-type(5) > a")
	WebElement contactForm;
	@FindBy(css = "#wpforms-3347-field_1")
	WebElement firstName;
	@FindBy(css = "#wpforms-3347-field_1-last")
	WebElement lastName;
	@FindBy(css = "#wpforms-3347-field_2")
	WebElement email;
	@FindBy(css = "#wpforms-3347-field_3_1")
	WebElement bronze;
	@FindBy(css = "input#wpforms-3347-field_4_1")
	WebElement session1;
	@FindBy(css = "input#wpforms-3347-field_5_1")
	WebElement overnightyes;
	@FindBy(css = "#wpforms-3347-field_6_1")
	WebElement emailreceived;
	@FindBy(css = "#wpforms-3347-field_7")
	WebElement comments;
	@FindBy(css = "#wpforms-submit-3347")
	WebElement submit;
	@FindBy(css="#wpforms-3347-field_1-error")
	WebElement errormessage;
	@FindBy(css="div.recaptcha-checkbox-border")
	WebElement captcha;
	@FindBy(css="#wpforms-3347-field_2-error")
	WebElement emailerror;
	

	public void ContactDetails() {
		contactForm.click();
		firstName.click();
		firstName.sendKeys("Amruta");
		lastName.click();
		lastName.sendKeys("Kanade");
		email.click();
		email.sendKeys("amrutakanade@gmail.com");
		bronze.click();
		session1.click();
		overnightyes.click();
		emailreceived.click();
		comments.click();
		comments.sendKeys("ghfhfh");
	}

	public void InvalidContactDetails() {
		contactForm.click();
		firstName.click();
		firstName.sendKeys("1234");
		lastName.sendKeys("1111");
		email.click();
		email.sendKeys("amrutakanade@gmail.com");
		bronze.click();
		session1.click();
		overnightyes.click();
		emailreceived.click();
		comments.click();
		comments.sendKeys("ghfhfh");
		

	}
	public void clickOnCaptcha() {
		captcha.click();

	}

	public void BlankForm() {
		contactForm.click();
		submit.click();

	}

	public void getTextError() {
	WebElement element=	BaseClass.getDriver().findElement(By.cssSelector("#wpforms-3347-field_1-error"));
	System.out.println(element.getText());

	}
	public void invalidEmailId() {
		contactForm.click();
		firstName.click();
		firstName.sendKeys("Amruta");
		lastName.click();
		lastName.sendKeys("Kanade");
		email.click();
		email.sendKeys("amrutakanade");
		email.submit();
		WebElement element=	BaseClass.getDriver().findElement(By.cssSelector("#wpforms-3347-field_2-error"));
		System.out.println(element.getText());
	}
	
}


