package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fqt {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\shital_Khot\\Desktop\\Yogesh Training\\chromedriver_win32 (2)\\chromedriver.exe");  
         
         // Instantiate a ChromeDriver class.     
		  WebDriver driver=new ChromeDriver();  
      
       // Launch Website  
		  driver.navigate().to("https://extranet-uat.fusionconnect.com/MPQT/Login.aspx");
		 // driver.findElement(By.xpath("//input[@id='txtUserName']")).sendKeys("mpqtsales");
		  //Thread.sleep(30000);
		  //driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("@Megapath");
		  //Thread.sleep(30000);
		  //driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		  
		  driver.findElement(By.linkText("Forgot Password?")).click();
		  Thread.sleep(30000);
		

	}

}
