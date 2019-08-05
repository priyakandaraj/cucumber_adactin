package com.maven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver sdriver) {
		this.driver=sdriver;
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
  @FindBy(xpath="//a[@class='login']")
  private WebElement signIn;



public WebElement getSignIn() {
	return signIn;
}
	
}
