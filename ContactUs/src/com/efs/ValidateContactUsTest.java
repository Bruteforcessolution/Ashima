package com.efs;

import org.testng.annotations.Test;

import com.bfs.pages.ContactUsPage;
import com.bfs.pages.HomePage;


import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ValidateContactUsTest {
	WebDriver driver;
  @Test
  public void Empty() {
	  HomePage hp=new HomePage(driver);
	  hp.ClickContactUs();
	  ContactUsPage cp=new ContactUsPage(driver);
	  cp.ContactUs("", "",0);
	  String actual= cp.readErrorMessage();
	     Assert.assertEquals("Invalid email address.", actual);

	  
	   }
  @Test
  public void validEmail() {
	  HomePage hp=new HomePage(driver);
	  hp.ClickContactUs();
	  ContactUsPage cp=new ContactUsPage(driver);
	  cp.ContactUs("ashi@bruteforceSolutions.com", "",0);
	     String actual= cp.readErrorMessage();
	     Assert.assertEquals("The message cannot be blank.", actual);
  }
  @Test
  public void validMessage() {
	  HomePage hp=new HomePage(driver);
	  hp.ClickContactUs();
	  ContactUsPage cp=new ContactUsPage(driver);
	  cp.ContactUs("", "TestMessage",0);
	  String actual= cp.readErrorMessage();
	     Assert.assertEquals("Invalid email address.", actual);

	  
	   }
  @Test
  public void validInput() {
	  HomePage hp=new HomePage(driver);
	  hp.ClickContactUs();
	  ContactUsPage cp=new ContactUsPage(driver);
	  cp.ContactUs("ashi@bruteforceSolutions.com", "TestMessage",1);
	   }

  
  
  @BeforeMethod
  public void OpenBrowser() {
	  System.setProperty("webdriver.chrome.driver","C:/Chrome/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://ebfs.bruteforcesolution.net/ebfs/index.php");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
  }

  @AfterMethod
  public void CloseBrowser() {
	  driver.close();
  }

}
