package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class web {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");		
		 WebDriver driver = new ChromeDriver(); 
		//wait 5 secs for  userid to be entered
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        
	
        driver.get("http://www.gmail.com");
        WebElement element = driver.findElement(By.id("Email"));
        element.sendKeys("dheeraj.qa87@gmail.com");
         
         driver.findElement(By.id("next")).click();
        //Enter Password
        WebElement element1 = driver.findElement(By.id("Passwd"));
        element1.sendKeys("Dheeraj143");
         
        //Submit button
        driver.findElement(By.id("signIn")).click();
         
         
       
        driver.findElement(By.xpath(".//a[@class='gb_b gb_cb gb_R']")).click();
         
        //press signout button
driver.findElement(By.id("gb_71")).click();   
         
         
   }
    
    

}
	


