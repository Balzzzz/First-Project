package org.web;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	
	public static WebDriver driver;
	
	@Test(priority=0)
	private void a1() {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	private  void a2() {
		driver.get("https://adactinhotelapp.com/");
	}
	
	@Test(priority=2)
	private  void a3() {
	
	WebElement User = driver.findElement(By.id("username"));
	User.sendKeys("Balamueugan67@");
	
	WebElement Pass = driver.findElement(By.id("password"));
	Pass.sendKeys("7658699044");
	
	
}
	@Test(priority=3)
	private  void a4() {
	
	WebElement Login = driver.findElement(By.id("login"));
	Login.click();
	
}
	@Test(priority=4)
    private void a5() {
	String exceptedMessage="Invalid Login details or Your Password might have expired. Click here to reset your password"; 
	
	String actualMessage=driver.findElement(By.xpath("//b[contains(text(),'Invalid Login details')] ")).getText();
	
	if (actualMessage.equals(exceptedMessage)) {
		System.out.println("ErrorMessage Decl Correctly");
		
	} else {
		System.out.println("Error Message not Decl Correctly");

	}


}
}