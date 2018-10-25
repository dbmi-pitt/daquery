package edu.pitt.dbmi.DaQery_SelWebTest;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class Daquery_Network extends Daquery_Base {

	@Test
	public void testNetwork() throws Exception {
		testDaquery();
		defaultLogin();
		// Verifications

		// driver.findElement(By.linkText("Networks"));
		driver.findElement(By.xpath(".//*[contains(@href, 'daquery/networks')]")).click();

		wait30sec();
		driver.findElement(By.xpath(".//*[contains(@class, 'fa fa-sign-in')]")).click();
		// driver.findElement(By.linkText("Join New Network"));
		wait30sec();

		WebElement joinNet = driver.findElement(By.xpath(".//*[contains(@formcontrolname, 'network')]"));
		Select sel = new Select(joinNet);
		sel.selectByVisibleText("DEV-ALL");
		wait30sec();

		WebElement dbType = driver.findElement(By.xpath(".//*[contains(@formcontrolname, 'driver')]"));
		Select sel2 = new Select(dbType);
		sel2.selectByVisibleText("Oracle");
		wait30sec();

		driver.findElement(By.xpath(".//*[contains(@formcontrolname, 'url')]"))
				.sendKeys("﻿jdbc:oracle:thin:@dbmi-db-dev-02.dbmi.pitt.edu:1521:dbmi09");
		wait30sec();

		driver.findElement(By.xpath(".//*[contains(@formcontrolname, 'username')]")).sendKeys("pcori_etl_31");
		wait30sec();

		driver.findElement(By.xpath(".//*[contains(@formcontrolname, 'password')]")).sendKeys("﻿dbmi17etl");
		wait30sec();
//		Thread.sleep(200000);

		driver.findElement(By.xpath(".//*[contains(@class, 'btn btn-info')]")).click();
		wait30sec();
		
		driver.findElement(By.xpath(".//*[contains(@class, 'text-red')]")).getText();
		System.out.println("Print test");
//		if (driver.findElement(By.xpath(".//*[contains(@class, 'text-red')]")) != null) {

			String warnMsg = driver.findElement(By.xpath(".//*[contains(@class, 'text-red')]")).getText();
			Reporter.log(warnMsg);
			System.out.println(warnMsg);
//		}

/*		else {
			String warnMsg = driver.findElement(By.xpath(".//*[contains(@class, 'text-green')]")).getText();
			Reporter.log(warnMsg);
			System.out.println(warnMsg);
		}*/

	}

	@AfterMethod
	public void tearDown() throws Exception {
		 driver.quit();
	}

}
