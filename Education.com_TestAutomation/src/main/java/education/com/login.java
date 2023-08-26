package education.com;

import org.openqa.selenium.By;

public class login extends driver_setup{
	
	public void _login() throws InterruptedException {
		driverSetup();
		
		driver.findElement(By.xpath("/html/body/header/div/div[3]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"react-reg-modal\"]/div/div[2]/div/div/div[2]/div/div[2]")).click();
		driver.findElement(By.name("identifier")).sendKeys("mr.tester.9021@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		
	}

}
