package Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.stqatools.com/demo/DoubleClick.php");
		   Actions action=new Actions(driver);
		   WebElement btn= driver.findElement(By.xpath("//button[contains(text), 'Click Me / Double Click Me')]"));
		   		
		   action.doubleClick(btn).perform();

	}

}
