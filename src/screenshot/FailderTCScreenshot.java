package screenshot;

import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class FailderTCScreenshot {
	WebDriver driver;


	@Test 
	public void TakeScreenshot() throws Exception {      
		driver.get("https://www.google.com/");
		
		try { 
			driver.findElement(By.name("q")).sendKeys("Tirupati");			
			driver.findElement(By.name("a")).sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[4]/a")).click();
			}
		catch(Exception e) { 	 
			takeScreenshot();       
		}      
	}
	
	public void takeScreenshot() throws Exception {              
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("E:\\Lib\\Screenshots\\Tirupati.png"));
	}



	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}

}
