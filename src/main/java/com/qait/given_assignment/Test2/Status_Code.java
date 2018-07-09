package com.qait.given_assignment.Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class Status_Code {
	
	WebDriver driver;
	Status_Code(WebDriver driver){
		this.driver=driver;
		
	}
	
	public  WebElement get_Status_Code_Link() 
	{driver.get("http://10.0.31.161:9292/");
		return driver.findElement(By.linkText("Status Codes"));
		
	}
public void verifying_Status_Code_Page_Displayed() {
		
		Assert.assertEquals("http://10.0.31.161:9292/status_codes",driver.getCurrentUrl());
			
	} 
public  WebElement get_404_Code_link() 
{
	return driver.findElement(By.linkText("404"));
	
}
public void verifying_404_Msg_Displayed() 
{
	boolean check=false;
	String text=driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
	if (text.contains("404"))
		check=true;
	Assert.assertTrue(check);
}
	
public void verifying_404_Status_Code() 
{
	boolean check=false;
	String text=driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
	String status[] =text.split("\\s+");
	System.out.println("status code is "+status[4]);
	if (status[4].equals("404"))
		check=true;
	Assert.assertTrue(check);
}	
}
