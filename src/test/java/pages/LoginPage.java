package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	private By username = By.xpath("//input[@id='user-name']");
	private By password = By.xpath("//input[@id='password']");
	private By submit =By.xpath("//input[@id='login-button']");
	private By slider = By.xpath("//button[text()='Open Menu']");
	private By logoutbtn =By.xpath("//a[text()='Logout']");
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	public void enterUsername(String text) {
		driver.findElement(username).sendKeys(text);
	}
	public void enterPassword(String text) {
		driver.findElement(password).sendKeys(text);
	}
	public void clickSubmit() {
		driver.findElement(submit).click();
	}
	public void clicksliderbar() {
		driver.findElement(slider).click();
	}
	public void logoutaccount() {
		driver.findElement(logoutbtn).click();
	}
	}

