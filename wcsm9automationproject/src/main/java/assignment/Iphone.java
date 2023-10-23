package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flipkart.com/");

	//Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='x']")).click();
	driver.findElement(By.name("q")).sendKeys("iphone");
	driver.findElement(By.xpath("")).click();
	// get the address of parent window.
	String parentHandle = driver.getWindowHandle();
	                 
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("(/div[@class='_2(c4'90']][1]"));
    driver.findElement(By.xpath(parentHandle("256 GB"))).click();
	driver.findElement(By.id("pincode Inputid")).clear();
    driver.findElement(By.id("pincode Inputid")).sendKeys("411033");
	driver.findElement(By.xpath("//span[text()='check'")).click();
	driver.findElement(By.xpath("//div[text()='Remove']")).click();
	driver.findElement(Web element remove Button("//div[contains(@class.'_3ds)]A0_24d_qjF'and text()Remove)).click"))
	}
}
	