package Testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) {
		
   System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
   WebDriver driver= new ChromeDriver();
   driver.get("https://www.google.com");
   //driver.navigate().to("https://www.google.com");
   driver.manage().window().maximize();
   WebElement searchbox= driver.findElement(By.name("q"));
   searchbox.sendKeys("Java Tutorial");
	/*
	 * searchbox.submit(); driver.navigate().back();
	 * System.out.println("Page title"+ driver.getTitle());
	 * driver.navigate().forward(); System.out.println("Page title"+
	 * driver.getTitle()); System.out.println("Get URL"+ driver.getCurrentUrl());
	 */
   try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   List<WebElement> eList=driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='sbtc']"));
		  for(int i=0;i<eList.size();i++) {
			  System.out.println(eList.get(i).getText());
			  if(eList.get(i).getText().equalsIgnoreCase("java tutorial pdf"))
			  {
				  eList.get(i).click();
				  break;
			  }
		  }
			  }
		  
   
	}


