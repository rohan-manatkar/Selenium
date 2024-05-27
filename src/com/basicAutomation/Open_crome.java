package com.basicAutomation;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_crome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
		org.openqa.selenium.WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		System.out.println( driver.getTitle());
		driver.manage().window().minimize();
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().fullscreen();
		 //System.out.println( driver.getPageSource());
		

	}

}