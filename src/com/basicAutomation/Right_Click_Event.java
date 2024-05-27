package com.basicAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
public class Right_Click_Event {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Driver//msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/buttons");
		WebElement ele=driver.findElement(By.id("rightClickBtn"));
		Actions A = new Actions(driver);
		A.contextClick(ele).build().perform();
	}

}
