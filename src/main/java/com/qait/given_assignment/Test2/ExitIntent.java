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
	public void move_mouse() throws AWTException, InterruptedException 
	{
		
		Robot rob = new Robot();
		int xcor=500;
        rob.mouseMove(xcor, 300);
        Thread.sleep(2000);
        rob.mouseMove(xcor, 100);
       
	
	}
	public void veriying_Modal_Window_Displayed() 
	{
		
		boolean check=driver.findElement(By.xpath("//*[@id=\"ouibounce-modal\"]/div[2]")).isDisplayed();
		Assert.assertTrue(check);
		String text = driver.findElement(By.xpath("//*[@id=\"ouibounce-modal\"]/div[2]/div[1]")).getText();
				Assert.assertEquals("THIS IS A MODAL WINDOW", text);
		
	}
	public void verifying_Modal_Window_Disappears() throws AWTException, InterruptedException  
	{
		boolean check = true;
		Robot rb = new Robot();
		rb.mouseMove(50,150);
	rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		Thread.sleep(2000);
		 check=driver.findElement(By.xpath("//*[@id=\"ouibounce-modal\"]/div[2]")).isDisplayed();
		Assert.assertFalse(check);
		
		
	}
	
	
	
	

}
