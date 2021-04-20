package Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("file://C:\\Selenium\\Test\\Test.html");
		  // driver.findElement(By.cssSelector("input[name=username]")).sendKeys("Testuser");
		  // driver.findElement(By.cssSelector(".password")).sendKeys("Test123");
		 //  driver.findElement(By.linkText("Google Page")).click();
		   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Testuser");
		   driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("Test123"); 

		   driver.findElement(By.xpath("//input[@name='continue']")).click();
	}

}
