package com.alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SwagLab {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		//Thread.sleep(1000);
		WebElement user =driver.findElement(By.id("user-name"));
		user.sendKeys("locked_out_user");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
	}

}
