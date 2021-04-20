package repositoryScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelDataTest {

	

		public static void main(String[] args) throws IOException {
			
				System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
				  WebDriver driver= new ChromeDriver();
				   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				   driver.manage().window().maximize();
				   driver.get("https://the-internet.herokuapp.com/login");
				   driver.findElement(By.id("username")).sendKeys(readData("username"));
				   driver.findElement(By.id("password")).sendKeys(readData("password"));
				   driver.findElement(By.xpath("//button[@type='submit']")).click();
				   
		}

		private static String readData(String colName) throws IOException {
			String path= System.getProperty("user.dir")+ "//testdata//config.properties";
			FileInputStream fin= new FileInputStream(path);
			XSSFWorkbook workbook = new XSSFWorkbook(fin);
			XSSFSheet loginsheet= workbook.getSheet("logindata");
			int numRows= loginsheet.getLastRowNum();
			System.out.println("Rows total"+ numRows);
			String colValue="";
			for(int i=0; i< numRows;i++) {
				XSSFRow row=loginsheet.getRow(i);
				if(row.getCell(0).getStringCellValue().equalsIgnoreCase(colName)) {
					colValue= row.getCell(1).getStringCellValue();
				}
				}
			workbook.close();
			return colValue;
		}
		


	}


