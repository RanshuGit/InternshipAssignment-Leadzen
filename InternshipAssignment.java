package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InternshipAssignment {
	// TODO Auto-generated method stub
	
	WebDriver driver;
	
	@BeforeTest
	public void initial() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anshu\\Selenium WebDriver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://leadzen.ai/");
		} 
	
	@Test(priority=1, description="First Verify Website")
	public void verifyTitle() {
		String expectedTitle = "The Most Intelligent Lead Generating Tool";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
		}
	
	@Test(priority=2, description="Check Details")
	public void check() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"menu-1-16e68b2c\"]/li[1]/a")).click();
		Thread.sleep(3000);
		}
	
	@AfterTest
	public void close() {
		driver.quit();
	}
}