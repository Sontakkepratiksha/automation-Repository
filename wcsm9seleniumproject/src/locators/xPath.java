package locators;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xPath {
	public static void main(String[] args) throws InterruptedException {
	//handal notification pop in Chrome browser
		
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--disable-notifications");
	ChromeDriver driver=new ChromeDriver(co);
	WebDriver driver2=new ChromeDriver();
	driver.get("https://www.airvistara.com/in/en");
	driver.findElement(By.xpath("//span[text()='Plan Travel']")).click();
	driver.findElement(By.xpath("//a[text()='Flights']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Select Departure City']")).sendKeys("pune");
	driver.findElement(By.xpath("//input[@placeholder='Select Arrival City']")).sendKeys("nagpur");
}
}