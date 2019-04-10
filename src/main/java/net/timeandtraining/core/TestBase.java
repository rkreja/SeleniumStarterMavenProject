package net.timeandtraining.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {
	protected WebDriver driver;
	
	@BeforeTest
	public void init() {
		if(System.getProperty("os.name").contains("Windows")) {
			System.setProperty("webdriver.chrome.driver","lib/chromedriver-windows-32bit.exe");
		}else {
			System.setProperty("webdriver.chrome.driver","lib/chromedriver-linux-64bit");
		}
		driver = new ChromeDriver();
	}
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}

}
