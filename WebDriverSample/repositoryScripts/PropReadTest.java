package repositoryScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropReadTest {
public static Properties prop;
	public static void main(String[] args) throws IOException {
		prop=new Properties();
		String path= System.getProperty("user.dir")+ "//testdata//config.properties";
		FileInputStream fin= new FileInputStream(path);
		prop.load(fin);
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			  WebDriver driver= new ChromeDriver();
			   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			   driver.manage().window().maximize();
			   driver.get(prop.getProperty("url"));
			   driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
			   driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
			   driver.findElement(By.xpath("//button[@type='submit']")).click();
			   

	}

}
