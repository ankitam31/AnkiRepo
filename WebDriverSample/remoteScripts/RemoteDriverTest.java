package remoteScripts;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;


public class RemoteDriverTest {

	public static void main(String[] args) throws MalformedURLException {
		//set desired cap
		ChromeOptions options= new ChromeOptions();
		options.setCapability(CapabilityType.PLATFORM_NAME,Platform.WINDOWS);
	//connecting to hub
		String strHub="http://192.168.1.13:4444/wd/hub";
		WebDriver driver= new RemoteWebDriver(new URL(strHub),options);
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.get("https://www.google.com");
		   WebElement searchbox= driver.findElement(By.name("q"));
		   searchbox.sendKeys("Selenium Tutorial");
			searchbox.submit();
			//Assert.assertEquals("Selenium Tutorial - Google Search",  driver.getTitle());
			
			

	}

}
