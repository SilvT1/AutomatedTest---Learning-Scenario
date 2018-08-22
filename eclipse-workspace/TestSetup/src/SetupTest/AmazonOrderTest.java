package SetupTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
// make sure the imports are in place (no red highlights warning of the absense of the report)
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonOrderTest {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/TSilva/eclipse-workspace/Utils/geckodriver.exe");
		
// ensure there is an existing link to geckodriver.exe - you will likely need to replace
// TSilva with an existing file directory
// here is a link to download geckodriver.exe https://github.com/mozilla/geckodriver/releases
		WebDriver driver = new FirefoxDriver();
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30); 
		
		driver.get("https://www.amazon.co.uk/");
// driver.get will bring the script directly over to the amazon website
// however ensure that the link to the geckodriver.exe exists so there maybe a need to change line 11 

//---------------------------------------------------------------------------------------------------------
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("air suspension");
		Thread.sleep(2500);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.RETURN);
//"twotabsearchtextbox" was the id used for the amazon search box during 14/08/2018
//if the test doesn't enter in the value then the amazon search bar has likely
//changed its id
		Thread.sleep(8000);	
		
//---------------------------------------------------------------------------------------------------------


//work on logic - click on first item whose id/classname is not equal to s-sponsered-list-header
//or s-sponsored-list
		
		//WebElement sponsoredList = driver.findElement(By.className("s-sponsored-list-header"));
		
		//WebElement resultLink = driver.findElement(By.className(("a-text-normal") ));
		
		//if(!sponsoredList.isDisplayed() && resultLink.isDisplayed())                                                                                                         
		//{         
		//	resultLink.click();    
		//}
		//failure
		
		webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("a-text-normal"))); 
// wait for the suggestions
        List<WebElement> results = driver.findElements(By.className("a-text-normal")); 
// find all the suggestions;
        results.get(0).click();
//clicks on the first suggestion
        
        
        //if(!sponsoredList.isDisplayed())                                                                                                         
      	//	{         
        //	 results.get(1).click();    
      	//	} 
        //failure
        
        //List<WebElement> search = driver.findElements(By.linkText("Filmography"));
        //if (!search.isEmpty())
        //{
        //    search.get(0).click();
        //}
        //failure
		
		//driver.findElement(By.className(("a-text-normal") )).click();
		
		

//---------------------------------------------------------------------------------------------------------
		
		
		driver.findElement(By.id("add-to-cart-button")).click();
//adds item to the amazon basket
		driver.findElement(By.id("hlb-view-cart-announce")).click();
//clicks the edit basket button
		driver.findElement(By.id("a-autoid-0")).click();
//clicks the dropdown menu to change the quality 
		driver.findElement(By.id("dropdown1_9")).click();
//clicks on one of the values for the dropdown options which should be 10+ at the time
// this causes a textbox to appear so entering a number for a quality
//equal to or greater than 10 is nesserary
		Thread.sleep(5000);
		driver.findElement(By.className("sc-quantity-textfield")).sendKeys("10");
//enters a value of "10" into the text field 
		Thread.sleep(2500);
		driver.findElement(By.className("sc-update-link")).click();
//clicks on the update button to enter the quality of the product into the basket
		Thread.sleep(5000);
		driver.findElement(By.className("sc-action-delete")).click();
// deletes Air suspension item from the basket by clicking on the button
		Thread.sleep(8000);
		
		
		driver.quit();
//exits the browser		
		
		
	}





}
