package com.bfs.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	WebDriver driver;
By popular=By.xpath(".//*[@id='home-page-tabs']/li[1]/a");
By popular1=By.xpath(".//*[@id='homefeatured']/li[1]/div/div[1]/div/a[1]/img");
By quickview1=By.xpath(".//*[@id='homefeatured']/li[1]/div/div[1]/div/a[2]");
public HomePage(WebDriver argdriver){
	driver=argdriver;
 }
public void ClickPopular(){
	driver.findElement(popular).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
public void mousehover(){
	driver.findElement(popular).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Actions builder=new Actions(driver);
	WebElement menuElement=driver.findElement(popular1);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	builder.moveToElement(menuElement).build().perform();
}
public void quickview(){
	driver.findElement(popular).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Actions builder=new Actions(driver);
	WebElement menuElement=driver.findElement(popular1);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	builder.moveToElement(menuElement).build().perform();
	driver.manage().window().maximize();
    driver.findElement(quickview1).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	

}
}


