package redmine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineTrainingDemo {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Libs\\chromedriver.exe");
		driver = new ChromeDriver();
		
		Thread.sleep(2000);		
		driver.manage().window().maximize();
		
		driver.get("https://dorcasdominicanbeautysalon.com/");	
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://squareup.com/appointments/book/4c7055bc-1fad-4f6d-b404-7608a6f1e83b/02RAM18CE02CJ/services");

		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
		
		
		

	}

}
