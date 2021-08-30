package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RediifLogoClick {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\shital_Khot\\Desktop\\Yogesh Training\\chromedriver_win32 (2)\\chromedriver.exe");  
        
        // Instantiate a ChromeDriver class.     
		  WebDriver driver=new ChromeDriver();  
     
      // Launch Website  
		
		 driver.navigate().to("https://www.rediff.com/");
		 
		 WebElement logo = driver.findElement(By.xpath("//span[@class='hmsprite logo']"));
		 Actions act = new Actions(driver);
		 act.contextClick(logo).build().perform();

	}

}
