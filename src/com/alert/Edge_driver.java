package Automation1.Driver;

import org.openqa.selenium.edge.EdgeDriver;

public class Edge_driver {
	public static void main(String[] args) {
		System.getProperty("WebDriver.edge.driver", "Driver//edgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://chatgpt.com/auth/login?next=%2Fc%2Fe6d6b615-bc21-4aa3-abe9-56a9f18d50e0");
		//driver.manage().window().
	}


}
