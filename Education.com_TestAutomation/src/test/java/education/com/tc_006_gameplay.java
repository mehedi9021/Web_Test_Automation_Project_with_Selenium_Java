package education.com;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class tc_006_gameplay extends driver_setup{
	
	public void test_gameplay() throws InterruptedException{
		driverSetup();
		
		//login
		driver.findElement(By.xpath("/html/body/header/div/div[3]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"react-reg-modal\"]/div/div[2]/div/div/div[2]/div/div[2]")).click();
		driver.findElement(By.name("identifier")).sendKeys("mr.tester.9021@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
				
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/nav/div/div/div[3]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"unified-search-results\"]/div/div[6]/div[1]/div[1]/div/a/div/a/div/div[1]/img")).click();
		
		//change aligned standards
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[3]/div[1]/select")));
		dropdown.selectByIndex(2);
		
		//tap to play
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[3]/div[1]/div[2]/a")).click();
		
		//share game to social media
		//share via facebook
		driver.findElement(By.cssSelector("#__next > div > div:nth-child(3) > div > div:nth-child(2) > div > a:nth-child(4) > svg > g > rect")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("xhpc_message_text")).sendKeys("This is the shared game!");
		driver.findElement(By.xpath("//*[@id=\"u_0_27_/i\"]")).click();
		
		driver.quit();
	}

}
