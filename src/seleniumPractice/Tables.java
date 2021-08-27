package seleniumPractice;


import java.awt.Toolkit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class Tables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shital_Khot\\Desktop\\Yogesh Training\\chromedriver_win32 (2)\\chromedriver.exe");  
        
        // Instantiate a ChromeDriver class.     
		  WebDriver driver=new ChromeDriver();  
     
      // Launch Website  
		  driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		  
		  WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		  List<WebElement> allrows = table.findElements(By.tagName("tr"));
		 
		  System.out.println("no of rows in table customer is"+allrows.size());
		  
		  int i=0;
		  for (WebElement webElement : allrows) {
			List<WebElement> Columns = webElement.findElements(By.tagName("td"));
			i++;
			System.out.println("no of rows in table customer is"+Columns.size());
			for (WebElement webElement2 : Columns) {
				System.out.print(" | " + webElement2.getText());
			}
		}
		

	}

}
