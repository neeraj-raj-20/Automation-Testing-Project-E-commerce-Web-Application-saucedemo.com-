package testExecution;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BasePage;
import pages.LoginPage;

public class Testcase_05 extends BasePage{

	@Test
	public void testProblemUserImages() {
	    LoginPage lp = new LoginPage(driver);
	    lp.enterUsername("problem_user");
	    lp.enterPassword("secret_sauce");
	    lp.clickSubmit();
	    String actualImageSrc = driver.findElement(By.xpath("//img[@src='/static/media/sl-404.168b1cce10384b857a6f.jpg']")).getAttribute("src"); // AR
	    System.out.println(actualImageSrc);
	    String expectedImageSrc = "https://www.saucedemo.com/static/media/sl-404.168b1cce10384b857a6f.jpg"; // ER
	    Assert.assertEquals(actualImageSrc, expectedImageSrc);
	    System.out.println("The product image is broken for problem_user!");
	}

}
