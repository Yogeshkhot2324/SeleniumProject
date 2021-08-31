package seleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shital_Khot\\Desktop\\Yogesh Training\\chromedriver_win32 (2)\\chromedriver.exe");  
        
        // Instantiate a ChromeDriver class.     
		  WebDriver driver=new ChromeDriver();  
     
      // Launch Website  
		Actions act= new Actions(driver);
		 driver.navigate().to("https://www.flipkart.com/");
		 driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		 
		WebElement serach= driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		 act.moveToElement(serach).click().sendKeys("hp laptop").build().perform();
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='col col-7-12'])[1]")).click();
		driver.getWindowHandles();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String>it = ids.iterator();
		
		String parentId = it.next();
		String chId = it.next();
		
		driver.switchTo().window(chId);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='col col-6-12'])[1]")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		
		
	}

}
