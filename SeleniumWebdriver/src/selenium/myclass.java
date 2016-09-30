package selenium;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

public class myclass {

 public static void main(String[] args) {
		        
		        WebDriver driver = new FirefoxDriver();
		        String baseUrl = "http://newtours.demoaut.com";
		        String expectedTitle = "Welcome: Mercury Tours";
		        String actualTitle = "";

		        
		        driver.get(baseUrl);

		    
		        actualTitle = driver.getTitle();

		       
		        if (actualTitle.contentEquals(expectedTitle)){
		            System.out.println("Test Passed!");
		        } else {
		            System.out.println("Test Failed");
		        }
		       
		        
		        driver.close();
		       
		        
		        System.exit(0);
		    }

		
	}


