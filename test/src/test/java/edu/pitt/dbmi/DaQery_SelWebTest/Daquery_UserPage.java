package edu.pitt.dbmi.DaQery_SelWebTest;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class Daquery_UserPage extends Daquery_Base {

	@Test
	public void testUserPage() throws Exception {
		testDaquery();
		defaultLogin();
		// Verifications
		try {
			assertEquals(driver.findElement(By.xpath("//li[2]/a/span")).getText(), "Incoming Requests");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		try {
			assertEquals(driver.findElement(By.xpath("//h1")).getText(), "Requests from me requests sent from me");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		try {
			assertEquals(driver.findElement(By.xpath("//li[3]/a/span")).getText(), "Outgoing Requests");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		try {
			assertEquals(driver.findElement(By.xpath("//li[4]/a/span")).getText(), "Networks");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		try {
			assertEquals(driver.findElement(By.linkText("Users")).getText(), "Users");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}

		try {
			driver.findElement(By.className("dropdown-toggle")).click();			
			WebElement we2 = driver.findElement(By.linkText("Logout"));			
			assertEquals(driver.findElement(By.linkText("Logout")).getText(), "Logout");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		driver.findElement(By.linkText("Users")).click();
		// Thread.sleep(200000000);
		wait30sec();
		driver.findElement(By.xpath(".//*[contains(@class, 'fa fa-circle-o')]")).click();
		// Thread.sleep(200000000);
		
		wait30sec();
		try {
			assertEquals(driver.findElement(By.xpath(".//*[contains(@class, 'content')]")).getText(), "Johnson");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		try {
			assertEquals(driver.findElement(By.xpath("//h3")).getText(), "Chuck_dev02");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		try {
			assertEquals(driver.findElement(By.xpath("//div[3]/app-local-user/div/div/div/div/a/h3")).getText(),
					"Bill");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
//		driver.findElement(By.xpath("//h3")).click();
		
		wait30sec();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

}
