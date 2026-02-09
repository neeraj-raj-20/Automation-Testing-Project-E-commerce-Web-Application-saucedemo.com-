package testExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BasePage;
import pages.LoginPage;

public class TC_performance  extends BasePage{
	@Test
	public void checkexplicitwait() {
	        LoginPage lp = new LoginPage(driver);
	        lp.enterUsername("performance_glitch_user");
	        lp.enterPassword("secret_sauce");
	        lp.clickSubmit();
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title")));
	        String expectedTitle = "Products"; // ER
	        String actualTitle = driver.findElement(By.className("title")).getText(); // AR
	        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match!");
	        System.out.println("Explicit wait is passed ");
	    }
	}


