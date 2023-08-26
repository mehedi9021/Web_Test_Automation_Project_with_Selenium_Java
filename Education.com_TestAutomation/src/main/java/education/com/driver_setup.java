package education.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driver_setup {
	
public  WebDriver driver;
	
	public void driverSetup() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.education.com/");
		
		//maximize the driver window
		driver.manage().window().maximize();
	}

}
