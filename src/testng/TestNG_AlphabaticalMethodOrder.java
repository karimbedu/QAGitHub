package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_AlphabaticalMethodOrder {
	WebDriver driver;
  
@Test
  public void redmine() {
	driver.get("https://www.redmine.org/");	
  }

@Test
public void google() {
	driver.get("https://www.google.com/");	
}


  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Libs\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
  }

  @AfterTest
  public void afterTest() {
  }

}
