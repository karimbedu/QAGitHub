package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_Descritpion {
	WebDriver driver;

	@Test(priority = 1, description="Twitter", enabled = true)
	public void testCase_1() {
		driver.get("https://www.twitter.com");
	}

	@Test(enabled = true, priority = 3, description="Google Search",timeOut = 5000)
	public void testCase_2() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("TestNG");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Test(description="seleniumlearn",priority = 2, enabled = true)
	public void testCase_3() throws Exception {
		driver.get("http://www.seleniumlearn.com");
		Thread.sleep(5000);
	}

	@Test(enabled = true, priority = 4,description="facebook")
	public void testCase_4() {
		driver.get("https://www.facebook.com");
	}

	@Test(priority = 0,description="seleniumDev")
	public void testCase_5() {
		driver.get("https://www.selenium.dev");
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
