package education.com;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class tc_001_signup extends driver_setup{
	
	@Test
	public void test_signUp() throws InterruptedException {
		driverSetup();
		
		driver.findElement(By.xpath("/html/body/header/div/div[4]/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"react-reg-modal\"]/div/div[2]/div/div/div/div/div[2]/div[3]")).click();
		
		//select age
		Select age = new Select(driver.findElement(By.xpath("//*[@id=\"react-reg-modal\"]/div/div[2]/div/div/div/div/div[1]/div/select")));
		age.selectByIndex(1);
		driver.findElement(By.xpath("//*[@id=\"react-reg-modal\"]/div/div[2]/div/div/div/div/div[2]/div[1]")).click();
		
		//create account
		driver.findElement(By.name("email")).sendKeys("mr.tester.9021@gmail.com");
		driver.findElement(By.name("password")).sendKeys("********");
		
		//select grade
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"react-reg-modal\"]/div/div[2]/div/div/form/div[1]/div[1]/div[10]/div")).click();
		
		driver.quit();
	}
	
}