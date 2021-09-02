package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class impliciet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shital_Khot\\Desktop\\Yogesh Training\\chromedriver_win32 (2)\\chromedriver.exe");  

		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String eTitle = "Google";
		String aTitle = "" ;
		// launch Chrome and redirect it to the Base URL
		driver.get("https://www.google.co.in/" );
		//Maximizes the browser window
		driver.manage().window().maximize() ;
		//get the actual value of the title
		aTitle = driver.getTitle();
		//compare the actual title with the expected title
		if (aTitle.equals(eTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
		}
		//close browser
		driver.close();

	}

}
