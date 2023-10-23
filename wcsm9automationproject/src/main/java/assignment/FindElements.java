package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.google.com/");
	
	driver.switchTo().activeElement().sendKeys("bike");
	 Thread.sleep(2000);
	 //identify all the suggesiton of bike
	List<WebElement.>bikeOption =driver.findElements(By.xpath(""))
    for(int i;<bikeO>)