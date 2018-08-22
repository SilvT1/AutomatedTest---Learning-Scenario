package SetupTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
// make sure the imports are in place (no red highlights warning of the absense of the report)
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Arrays;

import com.google.common.collect.Iterables;

public class ThirdSeleniumTest {
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
		Thread.sleep(3000);	
		
//---------------------------------------------------------------------------------------------------------


//work on logic - click on first item whose id is not equal to s-sponsered-list-header
//and s-sponsored-list
		
		
		
		List<WebElement> firstElement = driver.findElements(By.className("a-text-normal"));
		List<WebElement> avoidElement = driver.findElements(By.className("s-sponsored-header"));
		
		

		
		firstElement.get(0).click();
		
		
		int[] array = {1, 2, 3, 4, 5};

        for (int element: array) {
            System.out.println(firstElement);
            
            if(!((WebElement) avoidElement).isDisplayed() && ((WebElement) firstElement).isDisplayed())                                                                                                         
          		{         
            	((WebElement) firstElement).click();    
          		}  
        }
   
		
	}

	private static By getDriver() {
		// TODO Auto-generated method stub
		return null;
	}





}
