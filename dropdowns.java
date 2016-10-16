package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");		
		 WebDriver driver = new ChromeDriver(); 
		 driver.get("http://www.spicejet.com");
		 
		 driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		 Thread.sleep(5000L);
		 driver.findElement(By.xpath("//a[@value='TIR']")).click();
		 driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		 Thread.sleep(5000L);
		//driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/ul[2]/li[1]/a")).click();
		
		 Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));
		 Thread.sleep(5000L);
		 dropdown.selectByIndex(3);
		 Thread.sleep(5000L);
		 dropdown.selectByVisibleText("5 Adults");
		 Thread.sleep(5000L);
		 dropdown.selectByValue("8");
		 
		 driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();
		 System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
	}

}
