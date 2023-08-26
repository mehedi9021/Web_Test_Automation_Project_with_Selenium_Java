package rokomari.com;

import java.util.Locale.Category;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import rokomari.com.driver_setup;

public class tc_002_searchProduct extends driver_setup{
	
	@Test
	public void test_searchProducrt() throws InterruptedException {
		driverSetup();
		
		//select category
		//WebElement cat = driver.findElement(By.xpath("//*[@id=\"js--search-filter-btn\"]"));
		//Select category = new Select(cat);
		//category.selectByIndex(3);
		
		driver.findElement(By.xpath("//*[@id=\"js--search-filter-btn\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"js--main-header\"]/div/div/div[2]/div/form/div/div[1]/div/p[3]")).click();
		
		driver.findElement(By.name("term")).sendKeys("Ponds Men Facewash Acne Solution");
		driver.findElement(By.xpath("//*[@id=\"js--main-header\"]/div/div/div[2]/div/form/div/div[2]/button")).click();
		
		String searchresult = driver.findElement(By.xpath("/html/body/div[7]/div/div/div/section")).getText();
		
		String expectedText = "Ponds Men Facewash Acne Solution 100 Gm - 69620102";
		
		if (searchresult.contains(expectedText)) {
            // Perform action when the text matches the expected text.
            System.out.println("Found!");
        } else {
            // Perform action when the text does not match the expected text.
            System.out.println("Not Found!");
        }
		
		driver.quit();
	}
 
}
