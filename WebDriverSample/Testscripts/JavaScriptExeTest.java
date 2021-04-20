package Testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   JavascriptExecutor js=(JavascriptExecutor) driver;
   driver.get("https://demo.opencart.com/");
//		   Actions action=new Actions(driver);
//		   WebElement searchbox= driver.findElement(By.xpath("//input[@name='search']"));
//		   searchbox.sendKeys(Keys.chord(Keys.SHIFT,"p"));
//		   searchbox.sendKeys(Keys.chord("hone"));
   
   //using javascript
   
   WebElement searchbox= (WebElement)
		   js.executeScript("return document.getElementsByName('search')[0]");
   searchbox.sendKeys("Phone");
		 driver.findElement(By.xpath("//*[@id='search']/span/button")).sendKeys(Keys.ENTER);

		 js.executeScript("window.scrollBy(500,900)");
		// js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		 js.executeScript("history.go(-1)");
 System.out.println("Page url:"+ driver.getCurrentUrl());
//		 js.executeScript("history.go(1)");

		 // Date picker from calender 
		 
		   //driver.get("http://demo.automationtesting.in/Datepicker.html");
		 //  js.executeScript("document.querySelector('#datepicker1').value='28/03/2020'");
	}

}
