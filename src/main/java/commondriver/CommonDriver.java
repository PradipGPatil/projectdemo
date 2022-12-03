package commondriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonDriver {
	
	public WebDriver driver;
	
	public CommonDriver(String browserType) throws Exception {
		
		if(browserType.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else {
			throw new Exception("invalid browser type "+browserType);
		}
	
	}
	
	public void navigateToUrl(String url) {
		
		driver.get(url);		// here we are taking url

	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public String getTitleOfWeb() {
	return (driver.getTitle());	
	}
}
