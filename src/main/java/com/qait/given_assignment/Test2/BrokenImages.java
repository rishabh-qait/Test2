package com.qait.given_assignment.Test2;

import java.awt.Robot;
import java.awt.image.BufferedImage;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.http.HttpResponse;

public class BrokenImages {
	
	
WebDriver driver;
//WebElement image1;
int invalidImageCount;
	
	Robot rb;
	BrokenImages(WebDriver driver){
		this.driver=driver;
		
	}
	
	public WebElement get_Broken_Imageslink() 
	{
		return driver.findElement(By.linkText("Broken Images"));
		
	}
	public WebElement getting_Image1() 
	{
		
		 return driver.findElement(By.xpath("//*[@id=\"content\"]/div/img[1]"));
		 //image2= driver.findElement(By.xpath(""));
		
	}
	public WebElement getting_Image2() 
	{
		
		 return driver.findElement(By.xpath("//*[@id=\"content\"]/div/img[2]"));
		 //image2= driver.findElement(By.xpath(""));
		
	}
	public WebElement getting_Image3() 
	{
		
		 return driver.findElement(By.xpath("//*[@id=\"content\"]/div/img[3]"));
		 //image2= driver.findElement(By.xpath(""));
		
	}
	
	public void verifyimageActive(WebElement imgElement) {
		try {
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(imgElement.getAttribute("src"));
			String srcurl= imgElement.getAttribute("src");
			HttpResponse response = client.execute(request);
			if (response.getStatusLine().getStatusCode() != 200)
			{
				System.out.println("the source url of this broken image is "+srcurl);
				invalidImageCount++;}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void no_Of_Invalid_Images() 
	{
		System.out.println("the total no. of inavlid images are"+invalidImageCount);
		
	}
	
	
	

}
