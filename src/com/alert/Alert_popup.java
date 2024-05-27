package com.alert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Alert_popup {
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "Driver//msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi/config/mail");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]")).click();
		Alert a=driver.switchTo().alert();
		a.accept();
		a.getText();
		driver.switchTo().defaultContent();
		driver.quit();
	}

}
