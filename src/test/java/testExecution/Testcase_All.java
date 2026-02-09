package testExecution;

import org.testng.annotations.Test;

import generic.BasePage;
import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;

public class Testcase_All extends BasePage{
	@Test
	public void itemorderingprocess() {
		LoginPage lp = new LoginPage(driver);//created object to access LoginPage
		lp.enterUsername("standard_user");//UserName
		lp.enterPassword("secret_sauce");//Password
		lp.clickSubmit();//clicking on submit button
	  HomePage hp= new HomePage(driver);//created object class to access HomePage
		hp.selectdd("Price (low to high)");//changed product sorting
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
		checkout.clickonBacktoHome();//click on the back to home button 
		System.out.println("Your order is sucessfully placed");//confirmation message on console
		lp.clicksliderbar();//click on the sliderbar
		lp.logoutaccount();//click on logout account
	 }
}
