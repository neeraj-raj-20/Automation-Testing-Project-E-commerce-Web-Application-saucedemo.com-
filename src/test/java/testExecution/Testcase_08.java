package testExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BasePage;
import pages.HomePage;
import pages.LoginPage;

public class Testcase_08  extends BasePage{
	@Test
	public void price() {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername("visual_user");
	    lp.enterPassword("secret_sauce");
	    lp.clickSubmit();
	    HomePage hp = new HomePage(driver);
	    hp.clickfirstproduct();
	    hp.clickaddtocart();
	    hp.clicktobackproducts();
	    WebElement price = driver.findElement(By.xpath("((//div[@class='inventory_item_price']))[1]"));
	    	String ER = price.getText();
	    System.out.println(ER);
	    String AR ="$7.99";
	    Assert.assertNotEquals(ER, AR);
	    System.out.println("price is Dynamic and changing ");
	    
	}

}
