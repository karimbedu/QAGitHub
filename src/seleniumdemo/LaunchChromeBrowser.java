package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\Libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redmine.org/");
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.linkText("Prhdfojects")).click();
		driver.findElement(By.linkText("Help")).click();
		driver.quit();
	}

}
