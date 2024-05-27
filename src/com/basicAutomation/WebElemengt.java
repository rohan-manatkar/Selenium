package com.basicAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;;
public class WebElemengt {
public static void main(String[] args) {
	System.setProperty("WebDriver.Chrome.Driver", "Driver//chromedriver.exe");
	WebDriver obj = new ChromeDriver();
	obj.get("https://accounts.google.com/v3/signin/identifier?continue=http%3A%2F%2Fsupport.google.com%2Fmail%2Fanswer%2F8494%3Fhl%3Den%26co%3DGENIE.Platform%253DDesktop&ec=GAZAdQ&hl=en&ifkv=AaSxoQxMpBCkGeuApXriTrVnNbw3IIwd5keEtmFlmWh8UxPYPEr6cPSaNJ7GNqaaYb-F_Z1nqvVV&passive=true&sjid=12032840703869272517-AP&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1393532175%3A1715575569179649&ddm=0");
WebElement	email= obj.findElement(By.id("identifierId"));
email.sendKeys("rohanmanatkar9@gmail.com");
obj.findElement(By.className("VfPpkd-Jh9lGc")).click();
obj.findElement(By.className("VfPpkd-J1Ukfc-LhBDec")).click();
obj.findElement(By.className("VfPpkd-dgl2Hf-ppHlrf-sM5MNb")).click();


}
}
