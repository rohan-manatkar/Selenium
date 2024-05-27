package com.basicAutomation;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;


public class automate_firefox {
	public static void main(String[] args) {
	System.setProperty("WebDriver.Gecko.driver","Driver//geckodriver.exe");
	WebDriver driver = new FirefoxDriver(); 
	driver.get("https://www.youtube.com/");
	
	}

}
