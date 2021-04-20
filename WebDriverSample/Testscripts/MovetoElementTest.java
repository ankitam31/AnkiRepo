package Testscripts;

import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElementTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demo.opencart.com/");
		   Actions action=new Actions(driver);
			/*
			 * WebElement menu=
			 * driver.findElement(By.xpath("//a[contains(text(), 'Components')]"));
			 * 
			 * action.moveToElement(menu).perform();
			 * driver.findElement(By.xpath("//a[contains(text(),'Monitors (2)')]")).click();
			 */
		   WebElement searchbox= driver.findElement(By.xpath("//input[@name='search']"));
		   searchbox.sendKeys(Keys.chord(Keys.SHIFT,"p"));
		   searchbox.sendKeys(Keys.chord("hone"));
		 driver.findElement(By.xpath("//*[@id='search']/span/button")).sendKeys(Keys.ENTER);
		 //Taking screenshots
		 
		 TakesScreenshot screen=(TakesScreenshot) driver;
		 File srcFile= screen.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(srcFile, new File("C:\\Selenium\\Screenshots\\Webdriversample.png"));
		 
		 
		 Thread.sleep(1000);
		 searchbox= driver.findElement(By.xpath("//input[@name='search']"));
		 searchbox.sendKeys(Keys.PAGE_DOWN);
		 Thread.sleep(1000);
		 searchbox.sendKeys(Keys.BACK_SPACE);
		 
		// Robot robot= new Robot();
		 //robot.keyPress(arg0);
		 
	}

}
