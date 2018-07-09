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
	public void sending_Data_In_popup() 
	{
	Alert popup =	driver.switchTo().alert();

	//rb.keyPress(KeyEvent.VK_r);
	
	 popup.setAuthenticationCredentials("admin", "admin");
	
		popup.accept();
	}
	
	
	
	

}
