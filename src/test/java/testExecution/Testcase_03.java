package testExecution;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BasePage;
import pages.LoginPage;

public class Testcase_03 extends BasePage {
	@Test
	public void lockedOutUserTest() {
	    LoginPage lp = new LoginPage(driver);
	    lp.enterUsername("locked_out_user");
	    lp.enterPassword("secret_sauce");
	    lp.clickSubmit();
	    String error = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
	    Assert.assertTrue(error.contains("locked out"));
	    System.out.println("The login is locked out");

}}
