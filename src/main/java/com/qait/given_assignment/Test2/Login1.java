package com.qait.given_assignment.Test2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login1 {
	
	WebDriver driver;
	Login1(WebDriver driver){
		this.driver=driver;
		
	}
	public WebElement get_Form_Authentication_Link() 
	{
		return driver.findElement(By.linkText("Form Authentication"));
		
		
	}
public void verifying_LOGIN_Page_Displayed() {
		
		Assert.assertEquals("http://10.0.31.161:9292/login",driver.getCurrentUrl());
			
	} 
	public void get_And_Set_Username_Field(String uname) 
	{
		driver.findElement(By.id("username")).sendKeys(uname);
		
	}
	
	public void get_And_Set_Password_Field(String pass) 
	{
		driver.findElement(By.id("password")).sendKeys(pass);
		
	}
public void verifying_Invalid_Page_Displayed() {
		
		driver.findElement(By.xpath("//*[@id=\"flash\"]")).isDisplayed();
			
	} 
	
	
	
	
	public void click_Login() 
	{
		driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
		
	}
	
	
	
	

}
