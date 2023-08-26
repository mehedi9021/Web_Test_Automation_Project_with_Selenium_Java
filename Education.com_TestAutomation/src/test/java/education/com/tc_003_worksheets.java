package education.com;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class tc_003_worksheets extends driver_setup{
	
	@Test
	public void test_worksheets() throws InterruptedException{
		driverSetup();
		
		//login
		driver.findElement(By.xpath("/html/body/header/div/div[3]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"react-reg-modal\"]/div/div[2]/div/div/div[2]/div/div[2]")).click();
		driver.findElement(By.name("identifier")).sendKeys("mr.tester.9021@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[1]/a")).click();
		Thread.sleep(5000);
		
		//filter worksheets
		//by grade
		driver.findElement(By.xpath("//*[@id=\"unified-search-results\"]/div/div[5]/div/ul/li[4]/ul/li[8]/a")).click();
		Thread.sleep(5000);
		//by subject
		driver.findElement(By.xpath("//*[@id=\"unified-search-results\"]/div/div[5]/div/ul/li[5]/ul/li[2]/a")).click();
		Thread.sleep(5000);
		//by topic
		driver.findElement(By.xpath("//*[@id=\"unified-search-results\"]/div/div[5]/div/ul/li[6]/ul/li[2]/a")).click();
		Thread.sleep(5000);
		//by standard
		driver.findElement(By.xpath("//*[@id=\"unified-search-results\"]/div/div[5]/div/ul/li[7]/ul/li/a")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"unified-search-results\"]/div/div[6]/div[1]/div[1]/div/a/div/a/div/div[1]/img")).click();
		//print worksheet
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[2]/div[2]/div[2]/div[3]/div/button")).click();
		Thread.sleep(3000);
		
		//upgrade plan
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div[2]/div/div/div[2]/div[2]/div/a")).click();
		
		//join monthly plan
		driver.findElement(By.xpath("//*[@id=\"plans\"]/div[1]/div[1]/div/div/a")).click();
		
		//checkout
		driver.findElement(By.name("ccname")).clear();
		driver.findElement(By.name("ccname")).sendKeys("Md. Mehedi Hasan");
		driver.findElement(By.name("cardnumber")).clear();
		driver.findElement(By.name("cardnumber")).sendKeys("**********");
		
		driver.findElement(By.xpath("//*[@id=\"pmid_17977\"]/div/div/div/div/section[2]/form/div/div[2]/div/div[3]/button")).click();
		
		driver.quit();
		
	}

}
