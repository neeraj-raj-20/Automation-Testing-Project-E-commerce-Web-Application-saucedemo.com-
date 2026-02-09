package testExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BasePage;
import pages.HomePage;
import pages.LoginPage;

public class TC_homepage_03 extends BasePage{
	
		@Test
		public void addandremove() {
			LoginPage lp = new LoginPage(driver);
			lp.enterUsername("standard_user");//username for the website
			lp.enterPassword("secret_sauce");//password for website
			lp.clickSubmit();//login 
			HomePage hp =new HomePage(driver);
			hp.multipleproduct1();//added one item to the cart
			hp.multipleproduct2();//addede another item to the cart
			String ER ="2";//Expected result
			 WebElement ele = driver.findElement(By.xpath("//span[@data-test='shopping-cart-badge']"));
			 String items = ele.getText();
			 Assert.assertEquals(ER,items);//HardAssert
			 System.out.println(items +" :products in the cart");//Items available in the cart 
			 
			 hp.removeitem();//removed one item 
			 String ER2 ="1";
			 WebElement ele2 = driver.findElement(By.xpath("//span[@data-test='shopping-cart-badge']"));//after remove of item
			 String items2 = ele2.getText();
			 Assert.assertEquals(ER2,items2);
			 System.out.println(items2 +" :product in the cart");//Items available in the cart 
			 
		}

	}


