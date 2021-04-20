package Testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
           Select singleSel= new Select(driver.findElement(By.id("select-demo")));
           singleSel.selectByVisibleText("Tuesday");
           singleSel.selectByValue("Saturday");
           
           Select mulselect= new Select(driver.findElement(By.id("multi-select")));
           if(mulselect.isMultiple())
           mulselect.selectByValue("New York");
           mulselect.selectByIndex(2);
           mulselect.selectByVisibleText("Texas");
           
           List<WebElement> cities=mulselect.getAllSelectedOptions();
           System.out.println("No of items selected" + cities.size());
           mulselect.deselectByValue("Texas");
	}

}
