package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

public class GoogleSearchAssignment {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\shital_Khot\\Desktop\\Yogesh Training\\chromedriver_win32 (2)\\chromedriver.exe");  
        
        // Instantiate a ChromeDriver class.     
		  WebDriver driver=new ChromeDriver();  
     
      // Launch Website  
		
		 driver.navigate().to("https://www.google.com/");
		 Actions act=new Actions(driver);
		 
		 WebElement yogesh=driver.findElement(By.xpath("//input[@name='q']"));
		 
		 //act.moveToElement(yogesh).click().keyDown(Keys.SHIFT).sendKeys("facebook");
		// act.doubleClick(yogesh);
	
		 act.moveToElement(yogesh).click().keyDown(Keys.SHIFT).sendKeys("where is indore");
		 
		 
		 
		 Thread.sleep(2000);
		 act.contextClick(yogesh).build().perform();
		 
		  
	}

}
