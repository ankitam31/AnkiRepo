package Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("file://C:\\Selenium\\Test\\WebTable.html");
		   driver.findElement(By.xpath("//td[contains(text( ),'Keyboard')]//preceding-sibling::td//input[@type='checkbox']")).click();
		   

	}

}
