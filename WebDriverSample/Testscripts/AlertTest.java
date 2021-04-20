package Testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
//Normal Alert
		   driver.findElement(By.xpath("//button[contains(text(),'Click me!')][1]")).click();
		   Alert alert= driver.switchTo().alert();
		   System.out.println("Alert message is:"+ alert.getText());
		   Thread.sleep(1000);
		   alert.accept();
		   
		   //Confirmation Alert
		   driver.findElement(By.xpath("//button[contains(text(),'Click me!') and @class='btn btn-default btn-lg']")).click();
		   Alert confirm= driver.switchTo().alert();
		   System.out.println("Alert message is:"+ alert.getText());
		   Thread.sleep(1000);
		   confirm.dismiss();   
		   //Prompt Alert
		   
		   
	}

}
