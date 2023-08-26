package rokomari.com;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class tc_006_updateProfile extends tc_001_login{
	
	@Test
	public void test_updateprofile() throws InterruptedException {
		test_login();
		
		driver.findElement(By.xpath("//*[@id=\"dropdownMenu2\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/header/div/div/div/div/div[3]/div/div[3]/div/a[1]")).click();
		
		driver.findElement(By.linkText("Change Information")).click();
		
		driver.findElement(By.name("name")).sendKeys("Md. Mehedi");
		driver.findElement(By.name("dob")).sendKeys("01/01/1997");
		driver.findElement(By.xpath("//*[@id=\"my-account\"]/div/div/div[2]/main/section[2]/form[1]/div[3]/div[2]/label")).click();
		driver.findElement(By.id("personalInfo")).clear();
		
		driver.findElement(By.linkText("Add Mobile Number")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("phone")).sendKeys("016234486**");
		Thread.sleep(3000);
		driver.findElement(By.name("otpCode")).sendKeys("1234");
		driver.findElement(By.id("phoneNumberViaOtp")).click();
		
		driver.findElement(By.linkText("Change Profile Picture")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("photo")).sendKeys("D:\\SQA\\295746385_889062302483886_8185404229991488187_n.jpg");
		driver.findElement(By.id("imageInfo")).click();
		
		driver.findElement(By.linkText("Add Password")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.name("reTypePassword")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id=\"js--change-social-pass\"]")).click();
		
		driver.quit();
	}

}
