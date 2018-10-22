package edu.pitt.dbmi.DaQery_SelWebTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

@Test
public class Daquery_InValidLogin extends Daquery_Base {

	@Test
	public void testInValidLogin() throws Exception {
		testDaquery();
		Reporter.log("Log in with invalid credentials");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("shirey");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("demouser");
		driver.findElement(By.xpath("//button")).click();
		wait30sec();
		try {
			assertEquals(driver.findElement(By.xpath(".//*[contains(@class, 'alert alert-danger')]")).getText(),
					"Email or password is incorrect");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}

		String str = (driver.findElement(By.xpath(".//*[contains(@class, 'alert alert-danger')]")).getText());
		System.out.println("Warning Message: " + str);
		Reporter.log("Warning Message: " + str);

		Reporter.log("Click submit button without entering any credentials");
		driver.navigate().refresh();
		wait30sec();
		driver.findElement(By.xpath("//button")).click();
		wait30sec();
		try {
			assertEquals(driver.findElement(By.xpath(".//*[contains(@class, 'help-block')]")).getText(),
					"Email is required");
			// driver.findElement(By.className("alert alert-danger")).getText(),
			// "Email or password is incorrect");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}

		String str2 = (driver.findElement(By.xpath(".//*[contains(@class, 'help-block')]")).getText());
		System.out.println("Warning Message: " + str2);
		Reporter.log("Warning Message: " + str2);
		// find unique id
		String str3 = (driver.findElement(By.xpath(".//*[contains(@class, 'help-block')]")).getText());
		System.out.println("Warning Message: " + str3);
		Reporter.log("Warning Message: " + str3);

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

}
