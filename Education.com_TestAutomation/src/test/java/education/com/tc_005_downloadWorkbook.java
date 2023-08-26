package education.com;

import org.openqa.selenium.By;

public class tc_005_downloadWorkbook extends driver_setup{
	
	public void test_downloadWorkbook() throws InterruptedException{
		driverSetup();
		
		//login
		driver.findElement(By.xpath("/html/body/header/div/div[3]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"react-reg-modal\"]/div/div[2]/div/div/div[2]/div/div[2]")).click();
		driver.findElement(By.name("identifier")).sendKeys("mr.tester.9021@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[5]/a")).click();
		
		//filter workbooks
		//by Grade
		driver.findElement(By.xpath("//*[@id=\"unified-search-results\"]/div/div[5]/div/ul/li[4]/ul/li[2]/a")).click();
		//by Subject
		driver.findElement(By.xpath("//*[@id=\"unified-search-results\"]/div/div[5]/div/ul/li[5]/ul/li[3]/a")).click();
		//by Topic
		driver.findElement(By.xpath("//*[@id=\"unified-search-results\"]/div/div[5]/div/ul/li[6]/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"unified-search-results\"]/div/div[6]/div[1]/div[2]/div/a/div/a/div/div[2]/div[1]/span")).click();
		
		driver.findElement(By.id("download-link")).click();
		
		//verify from profile
		driver.findElement(By.cssSelector("#__next > div > header > div > div.TopNav-module_userLinks_1OXfx > div.UserMenu-module_userMenu_1U-_q > div.UserMenu-module_userTab_2gVmb > div.UserMenu-module_iconWrapper_3fdip > svg")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"downloads-link\"]")).click();
		
		String getText = driver.findElement(By.xpath("//*[@id=\"2023-08\"]")).getText();
		System.out.println(getText);
		String actualText = "Kindergarten Independent Study Packet - Week 5";
		
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
