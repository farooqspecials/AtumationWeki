package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class utils {
	
	public static WebDriver driver;
	
	public static WebDriver instantiate() {
		driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "./"+"\\Drivers\\geckodriver.exe");
			
		
		//wait for the  elements to appear/load in the web application to avoid exception in applicaiton
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        driver.manage().window().maximize();
        driver.get("http://www.wikipedia.org"); 
		return driver;
	}
	
	public static void closedriver() {
							
			driver.close();


				}
}
