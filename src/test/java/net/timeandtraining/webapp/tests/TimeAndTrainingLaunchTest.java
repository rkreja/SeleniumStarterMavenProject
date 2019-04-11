package net.timeandtraining.webapp.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.timeandtraining.core.TestBase;

public class TimeAndTrainingLaunchTest extends TestBase{

	
	@Test
	public void launchTimeAndTrainingTest() {
	
		driver.get("http://www.timeandtraining.net");
		WebElement e=driver.findElement(By.xpath("//h1[text()='Hi, Welcome!']"));
		Assert.assertNotNull(e);
	}
	
	@Test
	public void launchTimeAndTrainingTest2() {
	
		driver.get("http://www.timeandtraining.net");
		WebElement e=driver.findElement(By.xpath("//h1[text()='Hi, Welcome!']"));
		Assert.assertNotNull(e);
	}
	
	@Test
	public void launchTimeAndTrainingTest3() {
	
		driver.get("http://www.timeandtraining.net");
		WebElement e=driver.findElement(By.xpath("//h1[text()='Hi, Welcome!']"));
		Assert.assertNotNull(e);
	}
	
}

