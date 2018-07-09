package com.qait.given_assignment.Test2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class Hovers {
	
	WebDriver driver;
	Hovers(WebDriver driver){
		this.driver=driver;
		
	}
	
	public  WebElement get_Hovers_link() 
	{
		return driver.findElement(By.linkText("Hovers"));
		
	}
	
	public void verifying_Hover_Page() 
	{
		List<WebElement> listofimages = driver.findElements(By.className("figure"));
		int noofimages=listofimages.size();
		Assert.assertEquals("http://10.0.31.161:9292/hovers",driver.getCurrentUrl());
		Assert.assertEquals(noofimages,3);	
	}
	
	public void hover_On_Image1() 
	{
		WebElement image1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));
		Actions builder = new Actions(driver);
		Action movemouse = builder.moveToElement(image1).build();
		movemouse.perform();
		boolean status1 =driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/h5")).isDisplayed();
		boolean status2= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/a")).isDisplayed();
		Assert.assertTrue(status1);
		Assert.assertTrue(status2);
		
	}
	public void move_Away_From_Image1() 
	{
		//WebElement awayfromimage1 = driver.findElement(By.linkText("Go to Home"));
		WebElement awayfromimage1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3"));
		Actions builder = new Actions(driver);
		Action movemouse = builder.moveToElement(awayfromimage1).build();
		movemouse.perform();
		boolean status1 =driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/h5")).isDisplayed();
		boolean status2= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/a")).isDisplayed();
		Assert.assertFalse(status1);
		Assert.assertFalse(status2);
		
	}
	public void hover_On_Image2() 
	{
		WebElement image2 = driver.findElement(By.xpath("//img[contains(@src,'/img/avatar-blank.jpg')]"));
		Actions builder = new Actions(driver);
		Action movemouse = builder.moveToElement(image2).build();
		movemouse.perform();
		
	}
	public void hover_On_Image3() 
	{
		WebElement image3 = driver.findElement(By.xpath("//img[contains(@src,'/img/avatar-blank.jpg')]"));
		Actions builder = new Actions(driver);
		Action movemouse = builder.moveToElement(image3).build();
		movemouse.perform();
		
		
	}
	
	
	
	

}
