package testExecution;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BasePage;
import pages.LoginPage;

public class Testcase_02 extends BasePage{
	@Test
 public void invalidlogin() {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername("neeraj");//invalid username
		lp.enterPassword("Password123");//invalid password
		lp.clickSubmit();
		String ER ="https://www.saucedemo.com/";
		String AR =driver.getCurrentUrl();
		Assert.assertEquals(ER,AR);
		System.out.println("Login is verified with the invalid data");
 }
}
