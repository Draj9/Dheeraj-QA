package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");		
		 WebDriver driver = new ChromeDriver(); 
     
     driver.get("http://www.echoecho.com/htmlforms10.htm");
     driver.findElement(By.xpath("//input[@value='Cheese']")).click();
     driver.findElement(By.xpath("//input[@value='Beer']")).click();
     
	}

}
