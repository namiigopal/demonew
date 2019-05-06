package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A
{
	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium setup\\chromedriver_win32 (16)\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.google.com");
		   driver.manage().window().maximize();
		
	}

}
