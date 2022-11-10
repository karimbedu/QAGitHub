package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class SeleniumWaitCommands {
	WebDriver driver;

	@Test
	public void synchronization() throws Exception {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Tirupati");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[4]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Tirumala"+Keys.ENTER);		
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
