package com.basicAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
public class Drag_Drop {
public static void main(String[] args) {
	System.setProperty("WebDriver.chrome.driver","Driver//msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	WebElement Drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	WebElement drop =driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	Actions A = new Actions(driver);
	A.dragAndDrop(Drag, drop).build().perform();
}
}
