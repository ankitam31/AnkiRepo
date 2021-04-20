package Testscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindowTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.stqatools.com/demo/Windows.php");
		   String parentWin= driver.getWindowHandle();
		   System.out.println("Parent handle:"+ parentWin);
		   driver.findElement(By.xpath("//button[contains(text(), 'to open new Tab')]")).click();
		   Set<String> tabs= driver.getWindowHandles();
		   System.out.println("No of windows:"+ tabs.size());
		   for(String childWin:tabs) {
			   System.out.println("windows handle:"+ childWin);
			   if(!childWin.equalsIgnoreCase(parentWin)) {
				   driver.switchTo().window(childWin);
				   driver.findElement(By.xpath("//span[contains(text(),'Java')]")).click();
			   }
		   }
		   driver.close();
				   driver.switchTo().window(parentWin);
				   driver.findElement(By.xpath("//button[contains(text(), 'to open new Window')]")).click();
				   String popWin= driver.getWindowHandle();
				   Set<String> windows= driver.getWindowHandles();
				   System.out.println("No of windows:"+ windows.size());
				   for(String childWin:windows) {
					   if(!childWin.equalsIgnoreCase(parentWin)) {
						   driver.switchTo().window(popWin);
						   driver.findElement(By.xpath("//button[contains(text(),'New Message')]")).click();
						  
			   }
		   }
                   //driver.close();
                   driver.quit();
	}

}
