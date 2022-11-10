package log4j;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Log4jDemo {
	WebDriver driver;

	@Test
	public void log4jTutorial() throws InterruptedException {
		Logger log= Logger.getLogger("Google Seaech");
		PropertyConfigurator.configure("Log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Libs\\chromedriver.exe");
		driver = new ChromeDriver();
		log.info("Launch the Chrome Browser");
		
		driver.manage().window().maximize();
		log.info("Browse window maximized");
		
		driver.get("https://www.google.com");
		log.info("Enter the google url in browser");
		
		Thread.sleep(2000);
		log.info("Wait for 2 Seconds");
		
		driver.findElement(By.name("q")).sendKeys("Hello Log4j");
		log.info("Hello Log4j enter in google search");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		log.info("Enter button pressed in keyborad");
		
		Thread.sleep(1000);
		log.info("Wait for 1 Seconds");
		
		driver.quit();
		log.info("Browser window closed");
	}
	
	@Test
	public void duplicate() {
		//Initialize array   
        int [] arr = new int [] {15,8,10,22,11,22,15,10};   
          
        System.out.println("Duplicate numbers in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
	}
}
