package testExecution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BasePage;
import pages.HomePage;
import pages.LoginPage;

public class TC_homepage_05 extends BasePage{
@Test
public void sortingitemshightolow() {
	LoginPage lp = new LoginPage(driver);
	lp.enterUsername("standard_user");//username for the website
	lp.enterPassword("secret_sauce");//password for website
	lp.clickSubmit();//login 
	HomePage hp = new HomePage(driver);
	hp.selectdd("Price (high to low)");//sorting using dropdown price from low to high Ascending order
	 List<WebElement> Elements = driver.findElements(By.xpath("//div[@data-test='inventory-item-price']"));//locator
	 List<Double> actualPrices = new ArrayList<>();
	    for (WebElement element : Elements) {
	        String priceText = element.getText().replace("$", "");
	        actualPrices.add(Double.parseDouble(priceText));
	        List<Double> expectedPrices = new ArrayList<>(actualPrices);
	        Collections.sort(expectedPrices, Collections.reverseOrder());
	      Assert.assertEquals(actualPrices,expectedPrices);
	      System.out.println("prices are validated" +actualPrices);
}}}
