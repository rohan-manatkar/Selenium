package com.basicAutomation;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class Automate_Chatgpt {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
			WebDriver obj = new ChromeDriver();
			//obj.get("https://www.google.co.in/");
			obj.get("https://chatgpt.com/");
			WebElement login=obj.findElement(By.linkText("Stay logged out"));
			login.click();
		WebElement find	=obj.findElement(By.name("q"));
			find.sendKeys("what is java");
			find.submit();
		}

	}


