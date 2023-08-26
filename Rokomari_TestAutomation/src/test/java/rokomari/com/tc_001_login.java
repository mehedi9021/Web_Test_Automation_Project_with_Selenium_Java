package rokomari.com;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import rokomari.com.driver_setup;

public class tc_001_login extends driver_setup{
	
	@Test
	public void test_login() throws InterruptedException {
		driverSetup();
		
		driver.findElement(By.xpath("/html/body/header/div/div/div/div/div[3]/div/div[2]/a")).click();
		
		driver.findElement(By.name("username")).sendKeys("mr.tester.9021@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"js--btn-next\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("otp")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id=\"otp-login-form\"]/div[2]/div[1]/div/label")).click();
		driver.findElement(By.xpath("//*[@id=\"otp-login-form\"]/button")).click();
		
		//title verify
		
		System.out.println(driver.getTitle());
		String actualTitle = "Buy Book Online - Best Online Book Shop in Bangladesh | Rokomari.com";
		
		if(driver.getTitle().equals(actualTitle)) {
			System.out.println("Login Successful!");
		}
		else{
			System.out.println("Login Failed!");
		}
		
		driver.quit();
	}

}
