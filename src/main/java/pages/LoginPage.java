package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

		// we will find the element on the login page first
	@FindBy(name="uid")
	WebElement userid;
	
	@FindBy(name="password")
	WebElement passward;
	
	@FindBy(name="btnLogin")
	WebElement btn_click;
	
	public LoginPage (WebDriver driver) {
		
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void loginToApplication(String username,String pass)
	{
		elementcontrol.sendText(userid,username);
		elementcontrol.sendText(passward, pass);
		elementcontrol.clickElement(btn_click);
	}
	
}
