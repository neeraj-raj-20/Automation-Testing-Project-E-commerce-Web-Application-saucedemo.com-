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

public class Testcase_11 extends BasePage {
	@Test
	public void withoutlastname() {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername("standard_user");
		lp.enterPassword("secret_sauce");
		lp.clickSubmit();
		HomePage hp =new HomePage(driver);
		hp.multipleproduct1();
		hp.multipleproduct2();
		CartPage cp = new CartPage(driver);
		cp.clickonshoppingcart();
		cp.checkthecart();
		cp.checkoutproducts();
		CheckoutPage checkout =new CheckoutPage(driver);
		checkout.enterfname("alpha");
		checkout.enterpin("123456");
		checkout.clickoncheckout();//click on checkout
		 WebElement Errormsg = driver.findElement(By.xpath("//h3[@data-test='error']"));
		 String msg =Errormsg.getText();
		 System.out.println(msg);
		String ER ="Error: Last Name is required";
		 Assert.assertEquals(ER,msg);

}}
