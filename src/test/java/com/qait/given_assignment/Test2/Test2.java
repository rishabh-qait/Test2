package com.qait.given_assignment.Test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




public class Test2 {
 WebDriver driver;
 Basic_Auth basicobj;
 BrokenImages imagesobj;
 ExitIntent intentobj;
 Sorted_Data_Tables tableobj;
	
 @BeforeClass
	public void launch_Browser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rishabh.jain\\eclipse-workspace\\chromedriver.exe");
		driver= new ChromeDriver();
	     driver.get("http://10.0.31.161:9292/");
	     basicobj= new Basic_Auth(driver);
	imagesobj= new BrokenImages(driver);
	intentobj= new ExitIntent(driver);
	tableobj= new Sorted_Data_Tables(driver);
	}
	//@AfterClass
	public void close_Browser() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.quit();
		
		
	}
	//@Test(priority=1)
	public void test_case1() 
	{
		basicobj.get_Basic_Authlink().click();
		basicobj.sending_Data_In_popup();
		
	}
	@Test(priority=2)
	public void test_case2() 
	{
		imagesobj.get_Broken_Imageslink().click();
		WebElement image1= imagesobj.getting_Image1();
		WebElement image2= imagesobj.getting_Image2();
		WebElement image3= imagesobj.getting_Image3();
		imagesobj.verifyimageActive(image1);
		imagesobj.verifyimageActive(image2);
		imagesobj.verifyimageActive(image3);

		imagesobj.no_Of_Invalid_Images();
		driver.navigate().back();
		
		
	}
	@Test(priority=3)
	public void test_case3() 
	{
		intentobj.get_Exit_Intent_link().click();
		intentobj.verifying_Exit_Intent_Page_Displayed();
		intentobj.move_mouse();
		driver.navigate().back();
		
		
	}
	@Test(priority=4)
	public void test_case4() 
	{
		tableobj.get_Sorted_Data_Tables_link().click();
		tableobj.verifying_Sorted_Data_Tables_Page_Displayed();
		tableobj.sorting_Table1();
		
		
	}
	
	
	
	
	
	
}
