package sikuliDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterTest;

public class SikuliDemo {
	
	Screen s = new Screen();
	WebDriver driver;
	
	@Test(enabled=false)
	public void desktopAutomation() throws FindFailed, InterruptedException {
		//s.click("E:\\Libs\\Mytri\\Start.PNG");
		Thread.sleep(5000);
		s.click("E:\\Libs\\Mytri\\Wifi.PNG");
		Thread.sleep(5000);
		s.dragDrop("E:\\Libs\\Mytri\\ebook.PNG", "E:\\Libs\\Mytri\\mytri.PNG");
		//s.type("E:\\Libs\\Mytri\\Search.PNG", "Mytri");
	}

	@Test
	public void WebAutomation() throws FindFailed, Exception {
		driver.get("http://www.seleniumlearn.com");
		Thread.sleep(4000);
		s.click("E:\\Libs\\Mytri\\Down.PNG");
			
	}
	
	@Test(enabled=false)
	public void AttacheFileSelenium() throws FindFailed, Exception {
		driver.get("http://baalabharathi.com/upload-story/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"field-SUtF8PwfCXGXx46\"]")).sendKeys("baalabharathi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"field-8lqEle2zeOhMu0a\"]")).sendKeys("E:\\TECHLEARN\\Purushotham\\BaalabharathiStory.txt");
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
