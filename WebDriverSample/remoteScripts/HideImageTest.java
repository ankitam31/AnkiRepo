package remoteScripts;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HideImageTest {

	public static void main(String[] args) {
		   System.out.println("Inside main method");
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options= new ChromeOptions();
			disableImages(options);
			WebDriver driver= new ChromeDriver();
			   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			   driver.manage().window().maximize();
			   driver.get("http://www.amazon.in");

	}

	private static void disableImages(ChromeOptions options) {
		HashMap<String, Object> images= new HashMap<String,Object>();
		images.put("images", 2);
		HashMap<String, Object> prefs= new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values",images);
		options.setExperimentalOption("prefs",prefs);
	}
		
	}


