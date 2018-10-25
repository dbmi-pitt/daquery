package edu.pitt.dbmi.DaQery_SelWebTest;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

@Test
public class Daquery_ValidLogin extends Daquery_Base {

	@Test
	public void testValidLogin() throws Exception {
		testDaquery();
		defaultLogin();
//		Verifications
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
	          assertEquals(driver.findElement(By.linkText("Logout")).getText(), "Logout");
	        } catch (Error e) {
	          verificationErrors.append(e.toString());
	        }
	      }

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

}
