package testExecution;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BasePage;
import pages.LoginPage;

public class Testcase_01 extends BasePage{
	@Test
	public void validlogin() {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername("standard_user");//username for the website
		lp.enterPassword("secret_sauce");//password for website
		lp.clickSubmit();//login 
		String er ="https://www.saucedemo.com/inventory.html";
		String ar = driver.getCurrentUrl();//get the current title of the webpage 
		Assert.assertEquals(er, ar);
		System.out.println("Login is verified sucessfully for valid data");
	}

}
