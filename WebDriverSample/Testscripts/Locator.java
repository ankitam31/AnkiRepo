package Testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.get("https://www.testandquiz.com/selenium/testing.html");
		   //driver.navigate().to("https://www.google.com");
		   driver.manage().window().maximize();
		   
		   WebElement textbox= driver.findElement(By.id("fname"));
		   textbox.sendKeys("text123");
		   // Context click- right click
		   
		   Actions action=new Actions(driver);
		   action.contextClick(textbox).perform();
		   
		  driver.findElement(By.id("idOfButton")).click();
		    //driver.findElement(By.tagName("idOfButton")).click();
		  WebElement gender= driver.findElement(By.id("male"));
		  gender.click();
		  System.out.println("Gender selection" + gender.isSelected());
		  driver.findElement(By.className("Performance")).click();
		  driver.findElement(By.linkText("This is a link")).click();
		  driver.navigate().back();
		  List<WebElement> elements = driver.findElements(By.tagName("input"));
		  for(WebElement item: elements) {
			  System.out.println("Attribute name:"+ item.getAttribute("name"));
		  }
	}
		  
		  
	}


