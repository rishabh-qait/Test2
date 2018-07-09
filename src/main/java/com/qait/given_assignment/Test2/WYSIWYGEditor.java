package com.qait.given_assignment.Test2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class WYSIWYGEditor {
	
	
	
	WebDriver driver;
	WYSIWYGEditor(WebDriver driver){
		this.driver=driver;
		
	}
	public WebElement get_Editor_Link() 
	{
		return driver.findElement(By.linkText("WYSIWYG Editor"));
		
	}
	
	public void verifying_Editor_Page_Displayed() 
	{
		Assert.assertEquals("http://10.0.31.161:9292/tinymce", driver.getCurrentUrl());
	}
	
	public void clear_And_Edit() 
	{
		boolean check=false;
		driver.switchTo().frame(0);
		WebElement textbox=driver.findElement(By.xpath("//*[@id=\"tinymce\"]"));
		textbox.click();
		textbox.clear();
		textbox.sendKeys("QA INFOTECH");
		Actions actionObj = new Actions(driver);
		actionObj.keyDown(Keys.CONTROL)
		         .sendKeys(Keys.chord("A"))
		         .keyUp(Keys.CONTROL)
		         .perform();
		String colour = driver.findElement(By.className("mce-content-body")).getCssValue("color");
		//String fontWeight = driver.findElement(By.className("mce-content-body")).getCssValue("font-weight");

//boolean isBold = "bold".equals(fontWeight) || "bolder".equals(fontWeight) || Integer.parseInt(fontWeight) >= 700;
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id='mceu_3']")).click();
		
		if(colour.contains("rgba(0,0,0)"))
			check=true;
		Assert.assertTrue(check);
	}
	
	
	
	

}
