package seleniumPractice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shital_Khot\\Desktop\\Yogesh Training\\chromedriver_win32 (2)\\chromedriver.exe");  
        
        // Instantiate a ChromeDriver class.     
		  WebDriver driver=new ChromeDriver();  
     
      // Launch Website  
		  driver.navigate().to("https://jqueryui.com/resources/demos/droppable/default.html");
		  
		  Actions act=new Actions(driver);
		  
		  WebElement src=driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
		  WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
		  Thread.sleep(1000);
		  act.dragAndDrop(src, dest).build().perform();
		  Thread.sleep(2000);
		  

	}

}
