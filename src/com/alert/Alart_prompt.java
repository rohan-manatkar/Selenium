package com.alert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Alart_prompt {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDriver.edge.driver","Driver//msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	String url = "https://demoqa.com/alerts";
	driver.get(url);
	driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
	Alert a=  driver.switchTo().alert();
	a.sendKeys("hiiiii rohan");
	//a.accept();
	Thread.sleep(500);
}
}
