package basetest;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import commondriver.CommonDriver;
import pages.LoginPage;
import utils.ConfigUtils;

public class BaseTest {
	
	String currentWorkingDirectory;
	String configFileName;
	Properties configProperty;
	String url;
	String browserType;
	CommonDriver cmndriver;
	 LoginPage loginpage;
	WebDriver driver;
	
	

	@BeforeSuite
	public void preSetup() throws IOException {
		currentWorkingDirectory=System.getProperty("user.dir");
		configFileName=currentWorkingDirectory+"\\config\\config.properties";
		configProperty=ConfigUtils.readProperty(configFileName);
				
	}
	
	@BeforeClass
	public void setup() throws Exception {
		url=configProperty.getProperty("url");
		browserType=configProperty.getProperty("browserType");
		cmndriver=new CommonDriver(browserType);			// here we have created the object of the common driver 
		driver=cmndriver.getDriver();		// here we initiate the webdriver
		loginpage=new LoginPage(driver);
		cmndriver.navigateToUrl(url);
	}
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
