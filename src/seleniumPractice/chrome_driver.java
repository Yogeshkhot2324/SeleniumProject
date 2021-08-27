package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_driver {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\shital_Khot\\Desktop\\Yogesh Training\\chromedriver_win32 (2)\\chromedriver.exe");  
          
          // Instantiate a ChromeDriver class.     
		  WebDriver driver=new ChromeDriver();  
       
        // Launch Website  
		  driver.navigate().to("https://login.salesforce.com/");
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Yogeshkhot2324@gmail.com");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
		 driver.findElement(By.xpath("//input[@id='Login']")).click();
		 driver.findElement(By.linkText("Forgot Your Password?")).click();
		  Thread.sleep(50000);
	}

}
