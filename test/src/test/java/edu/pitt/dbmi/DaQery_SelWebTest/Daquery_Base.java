package edu.pitt.dbmi.DaQery_SelWebTest;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

public class Daquery_Base {
	public WebDriver driver;
	private String baseUrl;
	private String baseUrlNotConnected;
	private boolean acceptNextAlert = true;
	public StringBuffer verificationErrors = new StringBuffer();
	public static Properties DaqueryProps = new Properties();
	private String defaultPassword = "scoobySnacks!";
	private String adminRole = "admin";
	private String viewerRole = "viewer";
	private String stewardRole = "steward";


	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		try {
			InputStream input = new FileInputStream("test.properties");
			DaqueryProps.load(input);
			
		} catch (Exception e) {
			System.out.println("ERROR!! ERROR!!  CANNOT ACCESS TEST.PROPERTIES FILE.  SHUTTING DOWN");
			e.printStackTrace();
			System.exit(0);
		}
 		System.setProperty("webdriver.gecko.driver", "lib/geckodriver");
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver");
		
		//the 
		String browser = System.getProperty("browser");
		if (browser == null) {
			System.out.println("No browser specified.  Running the default browser: firefox.");
			browser = "firefox";
		}
		System.out.println("Running tests with this browser: " + browser);

		if (browser.compareToIgnoreCase("chrome") == 0) {
			ChromeOptions chromeOptions = new ChromeOptions();
		    chromeOptions.addArguments("--headless");
			driver = new ChromeDriver(chromeOptions);			
		} else {
			FirefoxBinary firefoxBinary = new FirefoxBinary();
	 	    firefoxBinary.addCommandLineOptions("--headless");
	 	    FirefoxOptions firefoxOptions = new FirefoxOptions();
	 	    firefoxOptions.setBinary(firefoxBinary);
	 	    firefoxOptions.setLogLevel(FirefoxDriverLogLevel.TRACE);
			driver = new FirefoxDriver(firefoxOptions);
		}
 		
		baseUrl = DaqueryProps.getProperty("baseUrlConnected");
		baseUrlNotConnected = DaqueryProps.getProperty("baseUrlNotConnected");

		driver.manage().window().maximize();
		//set the implicity wait time frame
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//wait30sec();
	}

	protected void wait30sec(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	public void testDaquery() throws Exception {
		driver.get(baseUrl + "daquery/");
		wait30sec();
    }
	
	protected void genericLogin(String username, String password){
		driver.get(baseUrl + "daquery/");
		wait30sec();
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button")).click();
		wait30sec();
		try {
		      assertFalse(driver.findElement(By.className("header")) == null,"Error: Unable to find menu header");
		      System.out.println("======>genericLogin Successful");
		    } catch (Error e) {
		      verificationErrors.append(e.toString());
		    }
	}

	protected void setupLogin(String sitename, String sitekey, String adminemail, String password, String realname){
		driver.get(baseUrlNotConnected + "daquery/setup");
		wait30sec();
		/* site-name, site-key, admin-email, admin-email_confirmation, admin-pwd, admin-pwd_confirmation, admin-real-name */
		driver.findElement(By.name("site-name")).clear();
		driver.findElement(By.name("site-name")).sendKeys(sitename);
		
		driver.findElement(By.name("site-key")).click();
		driver.findElement(By.name("site-key")).clear();
		driver.findElement(By.name("site-key")).sendKeys(sitekey);
		
		driver.findElement(By.name("admin-email")).click();
		driver.findElement(By.name("admin-email")).clear();
		driver.findElement(By.name("admin-email")).sendKeys(adminemail);

		driver.findElement(By.name("admin-email_confirmation")).click();
		driver.findElement(By.name("admin-email_confirmation")).clear();
		driver.findElement(By.name("admin-email_confirmation")).sendKeys(adminemail);

		driver.findElement(By.name("admin-pwd")).click();
		driver.findElement(By.name("admin-pwd")).clear();
		driver.findElement(By.name("admin-pwd")).sendKeys(password);

		driver.findElement(By.name("admin-pwd_confirmation")).click();
		driver.findElement(By.name("admin-pwd_confirmation")).clear();
		driver.findElement(By.name("admin-pwd_confirmation")).sendKeys(password);

		driver.findElement(By.name("admin-real-name")).click();
		driver.findElement(By.name("admin-real-name")).clear();
		driver.findElement(By.name("admin-real-name")).sendKeys(realname);
		
		
		driver.findElement(By.id("btn_initialize")).click();
		//it takes a long time to log in
		int timercount =0;
		long startTime = System.currentTimeMillis();
		while (driver.getCurrentUrl().contains("daquery/setup") && timercount < 5000) {
			
			wait30sec();
			timercount++;
		}
		long estimatedTime = System.currentTimeMillis() - startTime;
	    System.out.println("======>Done waiting.  count="+timercount + " time=" + estimatedTime/1000 + " raw time=" + estimatedTime);
		try {
		      assertFalse(driver.findElement(By.className("header")) == null,"Error: Unable to find menu header");
		      System.out.println("======>Setup Log in Successful");
		    } catch (Error e) {
		      verificationErrors.append(e.toString());
		    }
	}

	protected void resetPassword(String username, String oldpassword, String newpassword) {
		wait30sec();
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(oldpassword);
		driver.findElement(By.xpath("//button")).click();
		wait30sec();
		driver.findElement(By.name("old_password")).clear();
		driver.findElement(By.name("old_password")).sendKeys(oldpassword);
		driver.findElement(By.name("old_password")).click();
		driver.findElement(By.name("new_password")).clear();
		driver.findElement(By.name("new_password")).sendKeys(newpassword);
		driver.findElement(By.name("new_password")).click();
		driver.findElement(By.name("new_password_confirmation")).clear();
		driver.findElement(By.name("new_password_confirmation")).sendKeys(newpassword);
		driver.findElement(By.name("new_password_confirmation")).click();
		driver.findElement(By.className("btn-primary")).click();
		System.out.println("Reset Password.");
		
	}
	
	protected void addUser(String username, String password, String realname) {
		//click the "Local Users" link
		driver.findElement(By.className("fa-circle-o")).click();
		wait30sec();
		//click the "Add User" button
		driver.findElement(By.id("btn_add_user")).click();
		// Chrome was causing some problems with this button click event:
		if (driver.findElements( By.id("newuser-email") ).size() == 0) {
			driver.findElement(By.id("btn_add_user")).click();
		}
		driver.findElement(By.id("newuser-email")).clear();
		driver.findElement(By.id("newuser-email")).sendKeys(username);
		driver.findElement(By.id("newuser-password")).click();
		driver.findElement(By.id("newuser-password")).clear();
		driver.findElement(By.id("newuser-password")).sendKeys(password);
		driver.findElement(By.id("password_confirmation")).click();
		driver.findElement(By.id("password_confirmation")).clear();
		driver.findElement(By.id("password_confirmation")).sendKeys(password);
		driver.findElement(By.id("realname")).click();
		driver.findElement(By.id("realname")).clear();
		driver.findElement(By.id("realname")).sendKeys(realname);
		driver.findElement(By.id("btn_submit")).click();
		System.out.println("Created user: " + username  +".");
		wait30sec();
	}

	protected void defaultLogin(){
		genericLogin(DaqueryProps.getProperty("default_username"), DaqueryProps.getProperty("default_password"));
	}

	protected void stewardLogin(){
		genericLogin(DaqueryProps.getProperty("steward_username"), DaqueryProps.getProperty("steward_password"));
	}
	
	protected void viewerLogin(){
		genericLogin(DaqueryProps.getProperty("viewer_username"), DaqueryProps.getProperty("viewer_password"));
	}
	
	protected void logoutUser() {
		driver.findElement(By.id("a_login_name")).click();
		driver.findElement(By.id("a_logout")).click();
	}
	
	protected void updateRole(String realname, String newRole) {
		//click the "Local Users" link
		driver.findElement(By.className("fa-circle-o")).click();
		//click the link for the User you want to update
		//first, find the element with the User's name
		WebElement nameHeading = driver.findElement(By.linkText(realname));
		//next, go up one level in the xpath to get its "parent" and click it
		nameHeading.findElement(By.xpath("..")).click();
		//Click the Edit button
		driver.findElement(By.id("a_edit_user")).click();
		//Clear the role selections
		List<WebElement> roles = driver.findElements(By.className("checkbox-inline"));
		for (WebElement we : roles) {
			WebElement checkbox = we.findElement(By.className("ng-untouched"));
			
			//uncheck all the options
			if(checkbox.isSelected()) {
				checkbox.click();
			}
			//click the checkbox for the new role
			//String htmlId = "rb_"
			//if (newRole.compareToIgnoreCase("viewer")) == 0
			if (we.getText().compareToIgnoreCase(newRole) == 0) {
				checkbox.click();
				wait30sec();
			}
		}
		//submit changes
		//silly Buttons...
		driver.findElement(By.id("btn_submit")).click();		
	}
	
	
	public void testSetup() {
		setupLogin(DaqueryProps.getProperty("init_site_name"), DaqueryProps.getProperty("init_site_key"), 
				DaqueryProps.getProperty("init_email_address"), DaqueryProps.getProperty("init_admin_password"), 
				DaqueryProps.getProperty("init_real_name"));

	}

	//is that Kenny Loggins?
	public void testLogins() {
		defaultLogin();
		//NOTE: when initially creating the users, create them with the default password
		//by default, the new user accounts are required to reset their passwords
		//the password from the properties file is used to set the "final" password
		addUser(DaqueryProps.getProperty("admin_username"), defaultPassword, DaqueryProps.getProperty("admin_realname"));
		addUser(DaqueryProps.getProperty("steward_username"), defaultPassword, DaqueryProps.getProperty("steward_realname"));
		addUser(DaqueryProps.getProperty("viewer_username"), defaultPassword, DaqueryProps.getProperty("viewer_realname"));
		updateRole(DaqueryProps.getProperty("steward_realname"), stewardRole);
		updateRole(DaqueryProps.getProperty("viewer_realname"), viewerRole);
		updateRole(DaqueryProps.getProperty("admin_realname"), adminRole);
		logoutUser();
		resetPassword(DaqueryProps.getProperty("steward_username"),defaultPassword, DaqueryProps.getProperty("steward_password"));
		logoutUser();
		resetPassword(DaqueryProps.getProperty("viewer_username"),defaultPassword, DaqueryProps.getProperty("viewer_password"));
		logoutUser();
		resetPassword(DaqueryProps.getProperty("admin_username"),defaultPassword, DaqueryProps.getProperty("admin_password"));
		logoutUser();
	}
	
	@Test
	public void mainTest() {
		//run tests against the "connected" site first
		//the setup method connects the baseURL variable to the connected site
		testLogins();
		//run tests against "unconnected" site
		//TODO: pass the url into the test methods
		testSetup();
		//for now, switch the url:
		baseUrl = baseUrlNotConnected;
		testLogins();
		
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
//		driver.quit();
	}
}
