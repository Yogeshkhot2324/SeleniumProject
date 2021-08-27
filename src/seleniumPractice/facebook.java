package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shital_Khot\\Desktop\\Yogesh Training\\chromedriver_win32 (2)\\chromedriver.exe");  
        
        // Instantiate a ChromeDriver class.     
		  WebDriver driver=new ChromeDriver();  
     
      // Launch Website  
		  driver.navigate().to("https://en-gb.facebook.com/");
		  driver.findElement(By.linkText("Create New Account")).click();
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("yogesh");
		  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("khot");
		  driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8788322201");
          driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("yogesh2324@");
          Select s1= new Select(driver.findElement(By.xpath("//select[@id='day']")));
          s1.selectByVisibleText("29");
          Select s2= new Select(driver.findElement(By.xpath("//select[@id='month']")));
          s2.selectByVisibleText("Jan");
          Select s3= new Select(driver.findElement(By.xpath("//select[@id='year']")));
          s3.selectByVisibleText("1998");
          driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
          driver.findElement(By.xpath("//button[@name='websubmit']")).click();
          Thread.sleep(2000);
          
          
	}

}
