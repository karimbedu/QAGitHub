package jUnitDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DemoTestJunit {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Libs\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();	
		//driver.get("https://www.redmine.org/");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	void test1() {
		
		System.out.println("Hello");
		
	}
	

	@Test
	void test2() {
		System.out.println("Selenium");
	}
	

	@Test
	void test3() {
		System.out.println("Java");
	}

}
