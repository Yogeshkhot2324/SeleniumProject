package seleniumPractice;

import java.util.List;
import java.awt.Toolkit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\shital_Khot\\Desktop\\Yogesh Training\\chromedriver_win32 (2)\\chromedriver.exe");  
        
        // Instantiate a ChromeDriver class.     
		  WebDriver driver=new ChromeDriver();  
     
      // Launch Website  
		  driver.navigate().to("https://money.rediff.com/index.html");
		  WebElement table=driver.findElement(By.xpath("//div[@class='hmnseindicestable']"));
		  List<WebElement> allrows = table.findElements(By.tagName("ul"));
		  System.out.println("number of rows"+allrows.size());
		  int i=0;
		  for (WebElement webElement : allrows) {
			List<WebElement> Columns = webElement.findElements(By.tagName("li"));
			i++;
			System.out.println("no of rows in table customer is"+Columns.size());
			for (WebElement webElement2 : Columns) {
				System.out.print(" | " + webElement2.getText());
			}
		}
				
			}
		
			 
		  
	}


