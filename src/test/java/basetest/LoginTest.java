package basetest;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Parameters({"userid","userpassword"})
	@Test
	public void verifyLogin(String username,String passward) {
		loginpage.loginToApplication(username, passward);
		String expectedTitle="Guru99 Bank Manager HomePage";
		String actualTitle=cmndriver.getTitleOfWeb();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}
