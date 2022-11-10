package jUnitDemo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JUnitDemoTest {
	
	static WebDriver driver;


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Libs\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();	
		driver.get("https://www.redmine.org/");
	}	

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	void menus() {
		driver.get("https://www.redmine.org/");
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.linkText("Projects")).click();
		driver.findElement(By.linkText("Help")).click();	
	} 
	
	
	@Ignore // Junt 3 and 4
	@Test
	void signin() {
		driver.findElement(By.linkText("Sign in")).click();
		
	}

	@Disabled  // Junit 5
	@Test
	void register() {
		driver.findElement(By.linkText("Register")).click();		
	}
	
	@Test
	void bala() {
		driver.get("http://baalabharathi.com/upload-story/");		
	}
	

}
