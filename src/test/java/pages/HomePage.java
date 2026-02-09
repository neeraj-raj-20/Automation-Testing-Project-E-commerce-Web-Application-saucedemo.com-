package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	private WebDriver driver;
	private By dropdown = By.className("product_sort_container");
	private By firstproduct =By.xpath("//div[text()='Sauce Labs Onesie']");
	private By addtocart =By.xpath("//button[text()='Add to cart']");
	private By backtoproducts =By.xpath("//button[@id='back-to-products']");
	private By addtocartmultiple1 = By.id("add-to-cart-sauce-labs-onesie");
	private By addtocartmultiple2 =By.id("add-to-cart-sauce-labs-bike-light");
	private By removemultile2=By.id("remove-sauce-labs-bike-light");
	
	 public HomePage(WebDriver driver) {
		 this.driver=driver;
	 }
	 public void selectdd(String text){
		 WebElement dd = driver.findElement(dropdown);
		 Select s= new Select(dd);
		 s.selectByContainsVisibleText(text);
		 }
	 public void clickfirstproduct() {
		 driver.findElement(firstproduct).click();
	 }
	 public void clickaddtocart() {
		 driver.findElement(addtocart).click();
	 }
 public void clicktobackproducts() {
	 driver.findElement(backtoproducts).click();
 }
 public void multipleproduct1() {
	 driver.findElement(addtocartmultiple1).click();
 }
 public void multipleproduct2() {
	 driver.findElement(addtocartmultiple2).click();
 }
 public void removeitem() {
	 driver.findElement(removemultile2).click();
 }
 
 }
