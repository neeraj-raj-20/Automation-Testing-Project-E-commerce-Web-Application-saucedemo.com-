package testExecution;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import generic.BasePage;
import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;

public class Testcase_06 extends BasePage {
	@Test
	public void brokenpage() {
	    LoginPage lp = new LoginPage(driver);
	    lp.enterUsername("error_user");
	    lp.enterPassword("secret_sauce");
	    lp.clickSubmit();
	    HomePage hp = new HomePage(driver);
	    hp.selectdd("Price (low to high)");
	    Alert popup =driver.switchTo().alert();
	    System.out.println(popup.getText());
	    popup.accept();
		hp.clickfirstproduct();//Selected the first product
		hp.clickaddtocart();//Put the item into the cart
		hp.clicktobackproducts();//navigate back to HomePage
		CartPage cp = new CartPage(driver);//Objected created to access CartPage
		cp.clickonshoppingcart();//Click on shopping cart 
		cp.checkthecart();//check the product is present
		cp.checkoutproducts();//check out the products is 
		CheckoutPage checkout =new CheckoutPage(driver);
		checkout.enterfname("Alpha");//Enter First Name
		checkout.enterlname("oriz");//Enter Last Name
		checkout.enterpin("123456");//Enter PinCode
		checkout.clickoncheckout();//click on checkout
		checkout.confirmorder();//click on confirm order
		System.out.println("Your order is sucessfully placed");//confirmation message on console
		lp.clicksliderbar();//click on the sliderbar
		lp.logoutaccount();//click on logout account
}}
