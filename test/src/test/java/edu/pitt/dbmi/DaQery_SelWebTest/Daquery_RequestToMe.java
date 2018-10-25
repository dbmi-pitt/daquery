package edu.pitt.dbmi.DaQery_SelWebTest;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

@Test
public class Daquery_RequestToMe extends Daquery_Base {

	// Steward role is required
	@Test
	public void testRequestFromMe() throws Exception {
		testDaquery();
		defaultLogin();
		// Verifications
		driver.findElement(By.linkText("Incoming Requests")).click();
		wait30sec();
		driver.findElement(By.xpath(".//*[contains(@class, 'label pull-right bg-yellow')]")).click();
		wait30sec();

		driver.findElement(By.xpath(".//*[contains(@class, 'btn btn-success')]")).click();
		wait30sec();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		wait30sec();
		
		driver.findElement(By.xpath(".//*[contains(@class, 'label pull-right bg-gray')]")).click();
		wait30sec();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		 driver.quit();
	}

}
