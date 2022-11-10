package redmine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Libs\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redmine.org/account/register");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("user_mail")).sendKeys("techlearn.india@gmail.com");
		
		Thread.sleep(2000);
		
	
	//	new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]"))).selectByVisibleText("Nederlands");
		
	//	new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]"))).selectByValue("lt");
		
		new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]"))).selectByIndex(2);
		
		
	}

}
