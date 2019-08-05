package com.mavencucumber.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.ClickElement;

import com.maven.org.MavenBaseClass.BaseClass;
import com.maven.pom.HomePage;
import com.maven.pom.SignInPackage;


public class AutomationPractice extends BaseClass  {


	public static WebDriver driver;

		public static void main(String[] args) throws Exception {

			driver = getBrowser("chrome");

			getUrl("http://automationpractice.com/index.php");
			
			
			HomePage hp= new HomePage(driver);
			clickonWebelement(hp.getSignIn());
			
			SignInPackage sp= new SignInPackage(driver);
			inputValuestoWebelement(sp.getEmailField(),"priyakandaraj@gmail.com");
			inputValuestoWebelement(sp.getPassField(),"priya5");
			clickonWebelement(sp.getLoginField());
			
			
			
			//inputValuestoWebelement(driver.findElement(By.id("email")), "Hello@gmail.com");
			//inputValuestoWebelement(driver.findElement(By.id("pass")), "23467");
			/*inputValuestoWebelement(driver.findElement(By.xpath("//input[@name='firstname']")), "Priyadharshini");
			inputValuestoWebelement(driver.findElement(By.xpath("//input[@name='lastname']")), "kandaraj");
			inputValuestoWebelement(driver.findElement(By.xpath("//input[@name='reg_email__']")), "1234567890");
			inputValuestoWebelement(driver.findElement(By.xpath("//input[@name='reg_passwd__']")), "12345678");
			
			
			selectDropDownOption(driver.findElement(By.xpath("//select[@aria-label='Day']")), "22", "2");
		    clickonWebelement(driver.findElement(By.xpath("//input[@value='Log In']")));
			takeScreenShot("testscreen");
			
   */
		}
}

