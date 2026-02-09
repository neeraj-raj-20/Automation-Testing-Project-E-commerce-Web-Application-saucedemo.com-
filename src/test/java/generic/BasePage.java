package generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage {
protected WebDriver driver;
protected WebDriverWait wait;
 
@BeforeMethod
public void setup() {
	driver= new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	driver.get("https://www.saucedemo.com/");
}
@AfterMethod
public void close() {
	driver.quit();
}


}
