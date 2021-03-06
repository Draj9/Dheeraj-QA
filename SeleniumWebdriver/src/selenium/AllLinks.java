package selenium;

 import java.util.List;

 import java.util.concurrent.TimeUnit;
 import org.openqa.selenium.*;
 import org.openqa.selenium.firefox.FirefoxDriver;
 import org.openqa.selenium.support.ui.ExpectedConditions;
 import org.openqa.selenium.support.ui.WebDriverWait;

public class AllLinks {

 public static void main(String[] args) {
		        String baseUrl = "http://newtours.demoaut.com/";
		        WebDriver driver = new FirefoxDriver();
		        String underConsTitle = "Under Construction: Mercury Tours";
		        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		        driver.get(baseUrl);
		        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		        String[] linkTexts = new String[linkElements.size()];
		        int i = 0;

		        
		        for (WebElement e : linkElements) {
		            linkTexts[i] = e.getText();
		            i++;
		        }

		        
		        for (String t : linkTexts) {
		            driver.findElement(By.linkText(t)).click();
		            if (driver.getTitle().equals(underConsTitle)) {
		                System.out.println("\"" + t + "\""
		                        + " is under construction.");
		            } else {
		                System.out.println("\"" + t + "\""
		                        + " is working.");
		            }
		            driver.navigate().back();
		        }
		        driver.quit();
		    }
		
	}


