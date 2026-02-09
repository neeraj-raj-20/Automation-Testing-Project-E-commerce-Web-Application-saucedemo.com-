package testExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BasePage;
import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;

public class TC_checkout_01 extends BasePage {
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
	cp.checkoutproducts();
	CheckoutPage checkout =new CheckoutPage(driver);
	checkout.enterfname("Alpha");//Enter First Name
	checkout.enterlname("oriz");//Enter Last Name
	checkout.clickoncheckout();//click on checkout
	 WebElement Errormsg = driver.findElement(By.xpath("//h3[@data-test='error']"));
	 String msg =Errormsg.getText();
	 String ER ="Error: Postal Code is required";
	 Assert.assertEquals(ER,msg);
	 System.out.println("Enter the valid Pincode");
}}
