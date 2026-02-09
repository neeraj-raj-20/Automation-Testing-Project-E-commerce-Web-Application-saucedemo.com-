package testExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import generic.BasePage;
import pages.LoginPage;

public class Testcase_07 extends BasePage {
@Test
public void testVisualUserButtonColor() {
    LoginPage lp = new LoginPage(driver);
    lp.enterUsername("visual_user");
    lp.enterPassword("secret_sauce");
    lp.clickSubmit();
    WebElement productImg = driver.findElement(By.xpath("(//img[@class='inventory_item_img'])[1]"));
    String actualSrc = productImg.getAttribute("src"); // AR
    String expectedSrc = "https://www.saucedemo.com/static/media/sauce-backpack-1200x1500.02e1c86d.jpg"; // ER
   Assert.assertNotEquals(actualSrc, expectedSrc);
    System.out.println(" Visual Bug: The product image source is incorrect!");
 
    	
    }
}

