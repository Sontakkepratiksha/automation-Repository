package assignment;


import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
			
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	//handle hidden division pop up
	
	driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("q")).sendKeys("mobail");
	//identify
	driver.findElement(By.xpath("//button[contains(@aria-label,'Brands and More')]")).click();
	 String price = driver.findElement(By.xpath(""))
	
	driver.quit();
		
	}

}
