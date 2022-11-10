package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_TimeOut {
	WebDriver driver;

	@Test
	public void withOutTimeOut() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("www.techlearn.in");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Test(timeOut = 1000)
	public void withTimeOut() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("www.seleniumlearn.com");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	
	@Test(enabled = true, priority = 3, description="Google Search", timeOut = 1000)
	public void testCase_2() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("TestNG");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Karimbedu\\Documents\\Zoom\\geckodriver.exe");
        driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karimbedu\\Documents\\Lib\\chromedriver.exe");
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
