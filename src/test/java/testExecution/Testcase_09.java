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

public class Testcase_09 extends BasePage{
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
	    System.out.println("price is broken");
	    CartPage cp = new CartPage(driver);
	    cp.clickonshoppingcart();
	    cp.checkthecart();
	    cp.checkoutproducts();
	    CheckoutPage check = new CheckoutPage(driver);
	    check.enterfname("Alpha");//Enter First Name
		check.enterlname("oriz");//Enter Last Name
		check.enterpin("123456");//Enter PinCode
		check.clickoncheckout();//click on checkout
		 WebElement priceincheckout = driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
	    	String ER2 = priceincheckout.getText();
	    System.out.println(ER2);
	    String AR2 ="$7.99";
	    Assert.assertEquals(ER2, AR2);
	    System.out.println("price is correct in the checkout page");

}}
