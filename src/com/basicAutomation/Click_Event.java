package com.basicAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class Click_Event {
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","Driver//msedgedriver.exe");
		WebDriver Driver = new EdgeDriver(); 
		Driver.get("https://demoqa.com/buttons");
		WebElement el=Driver.findElement(By.id("doubleClickBtn"));
		Actions A = new Actions(Driver);
		A.doubleClick(el).build().perform();
	}

}
