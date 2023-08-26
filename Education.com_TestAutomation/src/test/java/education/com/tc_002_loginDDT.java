package education.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class tc_002_loginDDT extends driver_setup{
	

	@Test(dataProvider = "loginData")
	public void test_login(String email, String password) throws InterruptedException {
		driverSetup();
		
		driver.findElement(By.xpath("/html/body/header/div/div[4]/a[1]")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//*[@id=\"react-reg-modal\"]/div/div[2]/div/div/button")).click();
		
		WebElement emailField = driver.findElement(By.name("email"));
		WebElement passwordField = driver.findElement(By.name("password"));
		WebElement loginButton = driver.findElement(By.cssSelector("#react-reg-modal > div > div.modal-content > div > div > form > input"));
		
		emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
		
        }
		
	@DataProvider(name = "loginData")
    public Object[][] provideData() {
        return new Object[][] {
            {"mr.tester1@gmail.com", "123456"},
            {"mr.tester2@gmail.com", "123456"},
            {"mr.tester3@gmail.com", "123456"},
            {"mr.tester.9021@gmail.com", "123456"}
        };
	}
	
	@AfterMethod
    public void tearDown() {
        driver.quit();
	}

}
