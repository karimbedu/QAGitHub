package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterTest;

public class TestNG_Priority_Order {
	WebDriver driver;
  
@Test(priority=1)
  public void redmine() throws FindFailed {
	driver.get("https://www.redmine.org/");	
	
  }

@Test(priority=2)
public void google() {
	driver.get("https://www.google.com/");	
}

@Test(priority=0)
public void selenium() {
	driver.get("https://www.selenium.dev/");	
}

@Test(priority=3)
public void facebook() {
	driver.get("https://www.facebook.com/");	
}

@Test
public void gmail() {
	driver.get("https://www.gmail.com/");	
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
