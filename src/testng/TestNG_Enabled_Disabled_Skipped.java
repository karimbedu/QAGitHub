package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_Enabled_Disabled_Skipped {
	WebDriver driver;
  
@Test(priority=1,enabled=false)
  public void redmine() {
	driver.get("https://www.redmine.org/");	
  }

@Test(priority=2)
public void google() {
	driver.get("https://www.google.com/");	
	driver.findElement(By.name("q")).sendKeys("www.techlearn.in");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
}

@Test(priority=0,enabled=false)
public void selenium() {
	driver.get("https://www.selenium.dev/");	
}

@Test(priority=3)
public void facebook() {
	driver.get("https://www.facebook.com/");	
}

@Test(enabled=true)
public void gmail() {
	driver.get("https://www.gmail.com/");	
	driver.findElement(By.name("q")).sendKeys("www.techlearn.in");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
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
