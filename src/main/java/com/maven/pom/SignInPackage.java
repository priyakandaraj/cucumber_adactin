package com.maven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPackage {

	

	public WebDriver driver;
	
	public SignInPackage(WebDriver ldriver) {
   this.driver=ldriver;
   PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailField;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement passField;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginField;
	


	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getPassField() {
		return passField;
	}

	public WebElement getLoginField() {
		return loginField;
	}

	
	
	
}
