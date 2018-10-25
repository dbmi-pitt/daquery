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
public class Daquery_RequestFromMeNext extends Daquery_Base {

	@Test
	public void testRequestFromMeNext() throws Exception {
		testDaquery();
		defaultLogin();
		
		
		
		// Verifications
		driver.findElement(By.xpath(".//*[contains(@class, 'fa pointer fa-plus-square-o')]")).click();
		wait30sec();
		
		driver.findElement(By.xpath(".//*[contains(@class, 'btn btn-primary btn-xs')]")).click();
		wait30sec();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		wait30sec();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		 driver.quit();
	}

}
