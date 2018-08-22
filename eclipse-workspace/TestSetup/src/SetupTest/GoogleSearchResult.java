package SetupTest;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchResult{

    public static void main(String args[]) throws InterruptedException{

    	System.setProperty("webdriver.gecko.driver", "/Users/TSilva/eclipse-workspace/Utils/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        WebDriverWait wdw = new WebDriverWait(driver, 30); // create something which can wait for the suggestions
        driver.manage().window().maximize(); // maximize the browser window
        driver.get("https://www.google.co.in/"); // go to Google Search
        driver.findElement(By.cssSelector("#lst-ib")).sendKeys("Selenium"); // send the string "Selenium" to the input
        wdw.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".sbsb_b .sbqs_c"))); // wait for the suggestions
        List<WebElement> suggestions = driver.findElements(By.cssSelector(".sbsb_b .sbqs_c")); // find all the suggestions;
        suggestions.get(1).click();
        Thread.sleep(8000);
        wdw.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("r"))); // wait for the suggestions
        List<WebElement> results = driver.findElements(By.className("r")); // find all the suggestions;
        results.get(0).click();
        //for(WebElement suggestion : suggestions) { // iterate over all the suggestions

            //System.out.println(suggestion.getText()); // print the suggestions

        //}
        driver.quit(); // close the browser
    }
}