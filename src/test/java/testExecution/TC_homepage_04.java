package testExecution;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BasePage;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;

public class TC_homepage_04 extends BasePage {
	@Test
	public void removeallitems() {
			LoginPage lp = new LoginPage(driver);
			lp.enterUsername("standard_user");//username for the website
			lp.enterPassword("secret_sauce");//password for website
			lp.clickSubmit();//login
			HomePage hp =new HomePage(driver);
			hp.multipleproduct1();
			hp.multipleproduct2();
			CartPage cp = new CartPage(driver);//Objected created to access CartPage
			cp.clickonshoppingcart();//Click on shopping cart 
			cp.checkthecart();//check the product is present
			cp.removeitem();
			hp.removeitem();
			cp.checkthecart();
			cp.checkoutproducts();
			String ER = "https://www.saucedemo.com/cart.html";
			String AR = driver.getCurrentUrl();
			Assert.assertNotEquals(ER, AR);
			Reporter.log("Checkiing out without product");
		}
		
	}

