package edu.pitt.dbmi.DaQery_SelWebTest;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.security.Timestamp;
import java.util.concurrent.TimeUnit;

//import org.apache.commons.net.ntp.TimeInfo;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

//import dbmi.DaQery_SelWebTest.RandomData;
//import dbmi.DaQery_SelWebTest.RandomDate;

@Test
public class Daquery_RequestFromMe extends Daquery_Base {

	@Test
	public void testRequestFromMe() throws Exception {
		testDaquery();
		defaultLogin();
		//System.out.println(RandomDate.getCurrntDateNTime());
		// Verifications
		driver.findElement(By.xpath(".//*[contains(@class, 'btn btn-block btn-primary')]")).click();
		wait30sec();
		//driver.findElement(By.id("inquiry-name")).sendKeys("Test Query" + RandomDate.getCurrntDateNTime());
		wait30sec();
		//driver.findElement(By.id("inquiry-description")).sendKeys(RandomData.getRandomData250());
		wait30sec();
		//driver.findElement(By.id("sql_query"))
		//		.sendKeys(RandomData.getSQL());
		wait30sec();

		String winHandleBefore = driver.getWindowHandle();

		driver.findElement(By.xpath(".//*[contains(@class, 'btn btn-success')]")).click();
		wait30sec();

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		driver.findElement(By.xpath(".//*[contains(@class, 'modal-header')]")).click();
		wait30sec();

		driver.findElement(By.xpath("(//input[@value='81590cc9-9bcd-470e-bc10-065080996842'])")).click();
//		Thread.sleep(20000);
		wait30sec();
		
//		driver.findElement(By.xpath(".//*[contains(@class, 'btn btn-success')]")).click();
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		wait30sec();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		 driver.quit();
	}

}
