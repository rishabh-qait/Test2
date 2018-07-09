package com.qait.given_assignment.Test2;

//import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class ExitIntent {
	WebDriver driver;
	ExitIntent(WebDriver driver){
		this.driver=driver;
		
	}
	
	public  WebElement get_Exit_Intent_link() 
	{
		return driver.findElement(By.linkText("Exit Intent"));
		
	}
	public void verifying_Exit_Intent_Page_Displayed() {
		
		Assert.assertEquals("http://10.0.31.161:9292/exit_intent",driver.getCurrentUrl());
			
	} 
	public void move_mouse() 
	{
		Actions builder = new Actions(driver);
		Action mouseover=builder.moveByOffset(0,50).build();
		mouseover.perform();
		
	}
	
	
	
	

}
