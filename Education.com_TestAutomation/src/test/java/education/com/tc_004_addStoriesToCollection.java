package education.com;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class tc_004_addStoriesToCollection extends driver_setup{
	
	@Test
	public void test_addStoriesToCollection() throws InterruptedException{
		driverSetup();
		
		//login
		driver.findElement(By.xpath("/html/body/header/div/div[3]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"react-reg-modal\"]/div/div[2]/div/div/div[2]/div/div[2]")).click();
		driver.findElement(By.name("identifier")).sendKeys("mr.tester.9021@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/nav/div/div/div[3]/ul/li[8]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"unified-search-results\"]/div/div[5]/div/ul/li[4]/ul/li[4]/a")).click();
		
		//sort by Most Recent stories
		Select sort = new Select(driver.findElement(By.xpath("//*[@id=\"unified-search-results\"]/div/div[4]/div[4]/div/div/select")));
		sort.selectByVisibleText("Most Recent");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"unified-search-results\"]/div/div[6]/div[1]/div[1]/div/a/div/a/div/div[1]/img")).click();
		
		//add to collection
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[3]/div[1]/div[3]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[4]/div[2]/div/ul/li[1]/i")).click();
		driver.findElement(By.name("title")).clear();
		driver.findElement(By.name("title")).sendKeys("My collection");
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[4]/div[2]/div/div[2]/button[1]")).click();
		
		//verify from profile
		driver.findElement(By.cssSelector("#__next > div > header > div > div.TopNav-module_userLinks_1OXfx > div.UserMenu-module_userMenu_1U-_q > div.UserMenu-module_userTab_2gVmb > div.UserMenu-module_iconWrapper_3fdip > svg")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div/div[3]/div[2]/div[2]/ul/div[2]/div/li[3]/a")).click();
		
		String getText = driver.findElement(By.xpath("//*[@id=\"my-collections\"]/div/div/div/div")).getText();
		System.out.println(getText);
		String actualText = "My collection";
		
		if (getText.contains(actualText)) {
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		
		driver.quit();
	}

}
