package Automation1.Driver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class WebDriver_Mtd {
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "Driver//chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("https://www.youtube.com/");
		
	String title=obj.getTitle();
	System.out.println("this is a url = "+title);
	String url= obj.getCurrentUrl();
		System.out.println("url of page = "+url);
	String source	=obj.getPageSource();
	System.out.println("source of page = "+ source);
	}

}
