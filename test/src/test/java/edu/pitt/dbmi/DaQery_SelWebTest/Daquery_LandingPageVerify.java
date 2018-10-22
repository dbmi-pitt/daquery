package edu.pitt.dbmi.DaQery_SelWebTest;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

@Test
public class Daquery_LandingPageVerify extends Daquery_Base {

	@Test
	public void testLanding() throws Exception {
		testDaquery();
		defaultLogin();
		driver.findElement(By.linkText("Toggle navigation")).click();
		wait30sec();
		try {
		      assertNotEquals(driver.findElement(By.xpath("//section/ul/li")).getText(), "MAIN NAVIGATION");
		    } catch (Error e) {
		      verificationErrors.append(e.toString());
		    }
	    driver.findElement(By.linkText("Toggle navigation")).click();
	    Thread.sleep(2000);
	    try {
	        assertEquals(driver.findElement(By.xpath("//section/ul/li")).getText(), "MAIN NAVIGATION");
	      } catch (Error e) {
	        verificationErrors.append(e.toString());
	      }
	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

}
