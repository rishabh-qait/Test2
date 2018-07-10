package com.qait.given_assignment.Test2;

import java.awt.AWTException;

import org.junit.Assert;
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
 Login1 loginobj;
 Login2 loginobj2;
 Hovers hoverobj;
 WYSIWYGEditor editorobj;
 Status_Code statusobj;
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
	loginobj= new Login1(driver);
	loginobj2= new Login2(driver);
	hoverobj= new  Hovers(driver);
	editorobj= new WYSIWYGEditor(driver);
	statusobj= new Status_Code(driver);
	}
	//@AfterClass
	public void close_Browser() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.quit();
		
		
	}
	@Test(priority=1)
	public void test_case1() 
	{
		//basicobj.get_Basic_Authlink().click();
		basicobj.sending_Data_In_popup();
		driver.navigate().back();
		
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
	public void test_case3() throws AWTException, InterruptedException 
	{
		intentobj.get_Exit_Intent_link().click();
		intentobj.verifying_Exit_Intent_Page_Displayed();
		intentobj.move_mouse();
		intentobj.veriying_Modal_Window_Displayed();
		intentobj.verifying_Modal_Window_Disappears();
		driver.navigate().back();
		
		
	}
	//@Test(priority=4)
	public void test_case4() 
	{
		tableobj.get_Sorted_Data_Tables_link().click();
		tableobj.verifying_Sorted_Data_Tables_Page_Displayed();
		tableobj.sorting_Table1();
		tableobj.verifying_Sorted_Data_Tables_Page_Displayed();
		
	}
	@Test(priority=4)
	public void test_case5() 
	{
		loginobj.get_Form_Authentication_Link().click();;
		loginobj.verifying_LOGIN_Page_Displayed();
		loginobj.get_And_Set_Username_Field("tomsmith123");
		loginobj.get_And_Set_Password_Field("SuperSecr22e3etPassword!");
		loginobj.click_Login();
		loginobj.verifying_Invalid_Page_Displayed();
		driver.navigate().to("http://10.0.31.161:9292/");
		
	}
	
	
	@Test(priority=5)
	public void test_case6() 
	{
		loginobj2.get_Form_Authentication_Link().click();;
		loginobj2.verifying_LOGIN_Page_Displayed();
		loginobj.get_And_Set_Username_Field("tomsmith");
		loginobj.get_And_Set_Password_Field("SuperSecretPassword!");
		loginobj.click_Login();
		loginobj2.verifying_Valid_Page_Displayed();
		loginobj2.click_Logout();
		loginobj2.checking_Successful_Logout();
		driver.navigate().to("http://10.0.31.161:9292/");
		
	}
	
	
	
	@Test(priority=6)
	public void test_case7() 
	{
		hoverobj.get_Hovers_link().click();
		hoverobj.verifying_Hover_Page();
	hoverobj.hover_On_Image1();
	hoverobj.move_Away_From_Image1();
	driver.navigate().back();
	}
	@Test(priority=7)
	public void test_case8() {
		editorobj.get_Editor_Link().click();
		editorobj.clear_And_Edit();
		driver.navigate().back();
			
	}
	@Test(priority=8)
	public void test_case9() {
		statusobj.get_Status_Code_Link().click();
		statusobj.verifying_Status_Code_Page_Displayed();
		statusobj.get_404_Code_link().click();
		statusobj.verifying_404_Msg_Displayed();
		statusobj.verifying_404_Status_Code();
        statusobj.close_1();	
        statusobj.close_2();
	}
	
	
	
	
}
