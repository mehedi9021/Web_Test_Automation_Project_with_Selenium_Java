package rokomari.com;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class tc_007_newProducts extends tc_001_login{
	
	@Test
	public void test_newproducts() throws InterruptedException{
		test_login();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"js--entry-popup\"]/div[1]/button/i")).click();
		driver.findElement(By.xpath("/html/body/header/div/nav/div/div[2]/div/div/div/ul[1]/li[9]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"list-page-details\"]/div/section[1]/div/div[2]/div/a/button")).click();
		
		//create a new list
		driver.findElement(By.id("list_title")).sendKeys("List title");
		Select category = new Select(driver.findElement(By.xpath("//*[@id=\"my-account\"]/div/div/div[2]/main/section/div[2]/form/div[2]/select")));
		category.selectByIndex(1);
		driver.findElement(By.xpath("//*[@id=\"my-account\"]/div/div/div[2]/main/section/div[2]/form/div[3]/div[1]/label")).click();
		driver.findElement(By.name("dtl")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
		driver.findElement(By.id("products")).sendKeys("Neque porro quisquam");
		
		driver.findElement(By.id("submit")).click();
		
		driver.quit();
	}

}
