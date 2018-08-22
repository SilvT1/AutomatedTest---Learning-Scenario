package SetupTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondSeleniumTest {public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.gecko.driver", "/Users/TSilva/eclipse-workspace/Utils/geckodriver.exe");
//ensure there is an existing link to geckodriver.exe - you will likely need to replace
//TSilva with an existing file directory
//here is a link to download geckodriver.exe https://github.com/mozilla/geckodriver/releases
	WebDriver driver = new FirefoxDriver();
	
	
	driver.get("https://www.amazon.co.uk/Rear-Air-Suspension-Spring-37126790078/dp/B01KFGFP80/ref=sr_1_3?ie=UTF8&qid=1534337629&sr=8-3&keywords=air+suspension");
	
	
	driver.findElement(By.id("add-to-cart-button")).click();
	
	driver.findElement(By.id("hlb-view-cart-announce")).click();
	
	driver.findElement(By.id("a-autoid-0")).click();
	
	driver.findElement(By.id("dropdown1_9")).click();
	Thread.sleep(5000);
	driver.findElement(By.className("sc-quantity-textfield")).sendKeys("10");
	Thread.sleep(2500);
	driver.findElement(By.className("sc-update-link")).click();
	Thread.sleep(5000);
	driver.findElement(By.className("sc-action-delete")).click();
	Thread.sleep(8000);
	
	
	driver.quit();
	
}





}
