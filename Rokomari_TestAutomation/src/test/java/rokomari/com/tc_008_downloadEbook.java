package rokomari.com;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class tc_008_downloadEbook extends tc_001_login{
	
	@Test
	public void test_downloadEbook() throws InterruptedException{
		test_login();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"js--entry-popup\"]/div[1]/button/i")).click();
		driver.findElement(By.xpath("/html/body/header/div/nav/div/div[2]/div/div/div/ul[1]/li[4]/a")).click();
		driver.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/section[2]/div[2]/div/div[11]/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"details-page\"]/section[1]/div[1]/div/div[2]/div[2]/div[5]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"reader-operational-header\"]/button")).click();
		driver.findElement(By.linkText("//*[@id=\"reader-operational-header\"]/button")).click();
		
		//rate a book
		driver.findElement(By.xpath("/html/body/header/div/nav/div/div[2]/div/div/div/ul[1]/li[4]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/section[2]/div[2]/div/div[1]/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"js--rating\"]/i[4]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"js--review-writing\"]")).sendKeys("This book is good!");
		driver.findElement(By.id("review-image-upload-label")).sendKeys("D:\\SQA\\295746385_889062302483886_8185404229991488187_n.jpg");
		
		//submit
		driver.findElement(By.xpath("//*[@id=\"js--review-submit\"]")).click();
		
		driver.quit();
	}

}
