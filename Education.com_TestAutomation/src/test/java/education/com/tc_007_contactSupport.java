package education.com;

import org.openqa.selenium.By;

public class tc_007_contactSupport extends driver_setup{
	
	public void test_contactSupport() throws InterruptedException{
		driverSetup();
		
		//login
		driver.findElement(By.xpath("/html/body/header/div/div[3]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"react-reg-modal\"]/div/div[2]/div/div/div[2]/div/div[2]")).click();
		driver.findElement(By.name("identifier")).sendKeys("mr.tester.9021@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		
		driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[2]/ul/li[7]/a")).click();
		
		driver.findElement(By.id("full-name")).sendKeys("Md. Mehedi Hasan");
		driver.findElement(By.id("subject-line")).sendKeys("This is the subject line.");
		driver.findElement(By.id("message")).sendKeys("This is the message");
		//add attachment
		driver.findElement(By.xpath("subject-line")).sendKeys("C:\\Users\\User\\Pictures\\Image20221227212418.jpg");
		driver.findElement(By.id("submit")).click();
		
		//tell us what you think section
		//choose role
		driver.findElement(By.id("yui_3_18_1_1_1692631494102_32")).click();
		
		//grade I am in
		driver.findElement(By.id("yui_3_18_1_1_1692631494102_42")).sendKeys("X grade");
		//what do I like the most about Education.com
		driver.findElement(By.id("yui_3_18_1_1_1692631494102_49")).sendKeys("Education.com provides a comprehensive and engaging platform for learning, "
				+ "offering a diverse range of educational resources and activities that cater to various learning styles and age groups.");
		//how did I find out about Education.com
		driver.findElement(By.id("yui_3_18_1_1_1692631494102_49")).sendKeys("On internet");
		//how do I use Education.com
		driver.findElement(By.id("yui_3_18_1_1_1692631494102_49")).sendKeys("Remember that Education.com might have evolved or changed after my last knowledge "
				+ "update in September 2021, so be sure to check their website for any new features or updates.");
		//what do I think we could improve
		driver.findElement(By.id("yui_3_18_1_1_1692631494102_49")).sendKeys("Using the educational resource you selected to support your teaching, learning, "
				+ "or parenting goals. This could involve using worksheets in your classroom, engaging in interactive activities with othrs.");
		//do I have any additional comments or questions
		driver.findElement(By.id("yui_3_18_1_1_1692631494102_49")).sendKeys("Nothing from my end");
		
		//submit
		driver.findElement(By.id("yui_3_18_1_1_1692631494102_52")).click();
		
		driver.quit();
		
	}

}
