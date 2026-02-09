package testExecution;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BasePage;
import pages.LoginPage;

public class Testcase_04 extends BasePage{

	@Test
	public void loginandlogout() {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername("standard_user");//username for the website
		lp.enterPassword("secret_sauce");//password for website
		lp.clickSubmit();//login
		lp.clicksliderbar();//click on sliderbar
		lp.logoutaccount();//logout account
		String ER ="https://www.saucedemo.com/";
		String AR = driver.getCurrentUrl();
		Assert.assertEquals(ER,AR);//verification of assert
		System.out.println("The website is logging in and logout perfectley");
	}
	 
 }

