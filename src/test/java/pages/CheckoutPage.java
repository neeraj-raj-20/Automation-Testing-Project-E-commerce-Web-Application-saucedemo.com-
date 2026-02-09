package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	private WebDriver driver;
	private By firstname=By.id("first-name");
	private By lastname =By.id("last-name");
	private By pincode = By.id("postal-code");
	private By checkout = By.id("continue");
	private By confirm =By.id("finish");
	private By backtohome =By.id("back-to-products");
	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
	}
	public void enterfname(String Text) {
		driver.findElement(firstname).sendKeys(Text);
	}
	public void enterlname(String Text) {
		driver.findElement(lastname).sendKeys(Text);
	}
	public void enterpin(String Text) {
		driver.findElement(pincode).sendKeys(Text);
	}
	public void clickoncheckout() {
		driver.findElement(checkout).click();
	}
	public void confirmorder() {
		driver.findElement(confirm).click();
	}
	public void clickonBacktoHome() {
		driver.findElement(backtohome).click();
	}

}
