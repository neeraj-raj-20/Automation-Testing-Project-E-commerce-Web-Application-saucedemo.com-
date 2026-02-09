package testExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BasePage;
import pages.HomePage;
import pages.LoginPage;

public class TC_homepage_02 extends BasePage{
	@Test
	public void multipleproduct() {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername("standard_user");//username for the website
		lp.enterPassword("secret_sauce");//password for website
		lp.clickSubmit();//login
		HomePage hp =new HomePage(driver);
		hp.multipleproduct1();
		hp.multipleproduct2();
		String ER ="2";
		 WebElement ele = driver.findElement(By.xpath("//span[@data-test='shopping-cart-badge']"));
		 String items = ele.getText();
		 Assert.assertEquals(ER,items);
		 System.out.println("2 products in the cart");
		 
	}

}
