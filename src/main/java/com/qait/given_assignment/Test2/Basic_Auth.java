package com.qait.given_assignment.Test2;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Basic_Auth {
	
	WebDriver driver;
	
	Robot rb;
	Basic_Auth(WebDriver driver){
		this.driver=driver;
		
	}
	
	public WebElement get_Basic_Authlink() 
	{
		return driver.findElement(By.linkText("Basic Auth"));
		
	}
	public void sending_Data_In_popup() throws InterruptedException 
	{
		boolean check=false;
	Thread.sleep(2000);
	String URL = "http://" + "admin" + ":" + "admin" + "@" + "10.0.31.161:9292/basic_auth";
	driver.navigate().to(URL);
	Thread.sleep(4000);
	String text = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
	if (text.contains("Congratulations!"))
	check=true;
		Assert.assertTrue(check);
	}
	
	
	
	
	

}
