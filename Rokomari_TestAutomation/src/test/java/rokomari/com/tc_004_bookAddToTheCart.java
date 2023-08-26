package rokomari.com;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class tc_004_bookAddToTheCart extends driver_setup{
	
	@Test
	public void test_bookAddToTheCart() throws InterruptedException {
		driverSetup();
		
		//search book
		driver.findElement(By.name("term")).sendKeys("পদ্মানদীর মাঝি");
		driver.findElement(By.xpath("//*[@id=\"js--main-header\"]/div/div/div[2]/div/form/div/div[2]/button")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"js--notification-permission-modal\"]/div/div/button[1]")).click();
		
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div/section/div[2]/div/div[1]/div/a/div[1]/div[2]/button")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"js--details-btn-area\"]/a[2]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#cart-icon")).click();
		
		String availability = driver.findElement(By.xpath("//*[@id=\"js--available-content\"]/div/div/div[3]/div/div[1]/div[2]/div/p")).getText();
		System.out.println(availability);
		String availableText = "available";
		
		if(availability.contains(availableText)) {
			System.out.println("Added to the cart!");
		}
		else
		{
			System.out.println("Failed add to the cart!");
		}
		
		driver.quit();
	}

}
