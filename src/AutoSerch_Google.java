

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class AutoSerch_Google {
		public static void main(String[] args) {

	   
	       System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

	       WebDriver d = new ChromeDriver();// open the browser

	       d.manage().window().maximize();// maximize the windows

	       d.get("https://www.google.com/"); // open google automatically 
	       		WebElement element = d.findElement(By.name("q"));
	       element.sendKeys("what is java ");
	       element.submit();

	   }

	}

