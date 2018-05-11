package com.test.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestHello {

	@Test

	public void init() throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver", "/Users/i339884/Desktop/selenium/Selenium/softwares/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
 
		Thread.sleep(5000);
		driver.quit();
	}

}
