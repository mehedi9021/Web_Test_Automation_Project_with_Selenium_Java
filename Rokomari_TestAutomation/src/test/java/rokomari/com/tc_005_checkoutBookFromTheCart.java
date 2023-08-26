package rokomari.com;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class tc_005_checkoutBookFromTheCart extends driver_setup{
	
	@Test
	public void test_checkoutBookFromTheCart() throws InterruptedException {
		driverSetup();
		
		driver.findElement(By.cssSelector("#cart-icon")).click();
		driver.findElement(By.xpath("//*[@id=\"js-continue-to-shipping\"]")).click();
		
		//login by google
		driver.findElement(By.xpath("//*[@id=\"js--login-form\"]/div[1]/div/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div/ul/li[4]/div/div[1]/div/div[2]/div[1]")).click();
		Thread.sleep(3000);
		
		//verify title
		driver.findElement(By.cssSelector("#cart-icon")).click();
		driver.findElement(By.xpath("//*[@id=\"js-continue-to-shipping\"]")).click();
		
		Thread.sleep(3000);
		
		//fill up checkout form
		driver.findElement(By.xpath("//*[@id=\"shipping-payment\"]/div/div/div[1]/form/div[1]/div/div[2]/div[1]/p[3]/label")).click();
		driver.findElement(By.id("name")).sendKeys("Md. mehedi");
		driver.findElement(By.id("phone")).sendKeys("016234486**");
		
		Select city = new Select(driver.findElement(By.name("cityId")));
		city.selectByIndex(1);
		
		Select area = new Select(driver.findElement(By.name("areaId")));
		area.selectByIndex(12);
		
		driver.findElement(By.name("address")).sendKeys("Plot No. 32/C, Road-2, Dhaka 1230");
		driver.findElement(By.xpath("//*[@id=\"shipping-payment\"]/div/div/div[1]/form/div[2]/div/div[2]/div/div[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"shipping-payment\"]/div/div/div[1]/form/div[2]/div/div[3]/div[2]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"js--confirm-order\"]")).click();
		
		driver.quit();
	
	}

}
