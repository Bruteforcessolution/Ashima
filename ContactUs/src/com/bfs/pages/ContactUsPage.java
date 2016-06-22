package com.bfs.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {

	WebDriver driver;
	By email=By.xpath(".//*[@id='email']");
	By subjectBox=By.xpath(".//*[@id='id_contact']");
	By message=By.xpath(".//*[@id='message']");
	By submit=By.xpath(".//*[@id='submitMessage']");
	By errMsg=By.xpath(".//*[@id='center_column']/div/ol/li");
	public ContactUsPage(WebDriver argdriver){
		 driver=argdriver;
	}
	public void ContactUs(String emailid,String msg,int argSubject){
		driver.findElement(email).sendKeys(emailid);
		driver.findElement(message).sendKeys(msg);
		if(argSubject==1 || argSubject==2){
			Select subject=new Select(driver.findElement(subjectBox));
		subject.selectByIndex(argSubject);
		}
	driver.findElement(submit).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
}
	public String readErrorMessage(){
		String msg=driver.findElement(errMsg).getText();
		return msg;
		
	}
}