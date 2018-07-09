package com.qait.given_assignment.Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class Sorted_Data_Tables {
	
	WebDriver driver;
	WebElement due1;
	WebElement table1;
	boolean condition=true;
	 Sorted_Data_Tables(WebDriver driver){
		this.driver=driver;
		
	}
	
	public  WebElement get_Sorted_Data_Tables_link() 
	{
		return driver.findElement(By.linkText("Sortable Data Tables"));
		
	}
public void verifying_Sorted_Data_Tables_Page_Displayed() {
		
		Assert.assertEquals("http://10.0.31.161:9292/tables",driver.getCurrentUrl());
			
	} 

public void sorting_Table1()
{

	 table1= driver.findElement(By.id("table1"));
	 due1=table1.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[2]/td[4]"));
	System.out.println(due1.getText());
	//WebElement due2=table1.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[3]/td[4]"));
	//WebElement due3=table1.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[4]/td[4]"));
	//WebElement due4=table1.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[5]/td[4]"));
	if((due1.getText().equalsIgnoreCase("$100.00"))) 
		condition=false;
	while(condition)
	{
		table1.findElement(By.xpath("//*[@id=\"table1\"]/thead/tr/th[4]/span")).click();
		
	}
	
}	

}
