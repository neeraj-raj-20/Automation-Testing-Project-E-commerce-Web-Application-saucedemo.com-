package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	private WebDriver driver;
	private By shoppingcart = By.className("shopping_cart_link");
	private By cart =By.className("cart_item");
	private By checkout =By.id("checkout");
	private By removeitem_1 = By.id("remove-sauce-labs-onesie");
	
	 public CartPage(WebDriver driver) {
		 this.driver=driver;
	 }
	
	public void clickonshoppingcart() {
		 driver.findElement(shoppingcart).click();
	 }
	 public void checkthecart() {
		 List<WebElement> items = driver.findElements(cart);
		 if(items.size()>0 && items.get(0).isDisplayed()) {
			 System.out.println(items.size()+":The product  in the cart");
		 }
		 else {System.out.println(items.size()+":The product is no in the cart");
	 }
	 } public void checkoutproducts() {
			driver.findElement(checkout).click(); 
		 }
	 public void removeitem() {
		 driver.findElement(removeitem_1).click();
	 }

}
