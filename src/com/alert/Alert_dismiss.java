package com.alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Alert_dismiss {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDriver.edge.driver","Driver//msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	String url = "https://demoqa.com/alerts";
	driver.get(url);
	driver.findElement(By.id("confirmButton")).click();
	Thread.sleep(500);
	driver.switchTo().alert().dismiss();
	Thread.sleep(500);
}
}
