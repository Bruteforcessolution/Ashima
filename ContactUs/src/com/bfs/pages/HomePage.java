package com.bfs.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
WebDriver driver;
By ContactUs=By.xpath(".//*[@id='contact-link']/a");

public HomePage(WebDriver argdriver){
	driver=argdriver;
 }
public void ClickContactUs(){
driver.findElement(ContactUs).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
	
	
	
}
