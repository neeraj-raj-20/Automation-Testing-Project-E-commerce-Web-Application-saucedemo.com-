package testExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BasePage;
import pages.LoginPage;

public class Testcase_12 extends BasePage{
	@Test
	public void shoppingcartloc() {
	LoginPage lp = new LoginPage(driver);
	lp.enterUsername("visual_user");
	lp.enterPassword("secret_sauce");
	lp.clickSubmit();
	WebElement header = driver.findElement(By.id("header_container"));
	WebElement cart = driver.findElement(By.className("shopping_cart_link"));
	int headerY = header.getLocation().getY();
	System.out.println(headerY);
	int cartY = cart.getLocation().getY();
	System.out.println(cartY);
	Assert.assertTrue(cartY >= headerY);
	System.out.println("Cart has drifted outside of the header area!");
}}
