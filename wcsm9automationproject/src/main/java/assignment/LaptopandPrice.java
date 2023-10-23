package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaptopandPrice {
	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	driver.get("https://www.flipkart.com/");
	// handle the pop up
	driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
	// search for laptop in search text
	driver.findElement(By.xpath("")).click();
	// click on search icon
	driver.findElement(By.xpath("")).sendKeys("laptop");
	//click on brand and select the hp
	driver.findElement(By.xpath("")).click();
	//click on core 7 from processor
	driver.findElement(By.xpath("")).click();
	//click on os and select the windows 11 hp
	driver.findElement(By.xpath("")).click();
	//select the 4&above rating from customer rating
	Thread.sleep(2000);
	driver.findElement(By.xpath("")).click();
	Thread.sleep(2000);
	//identify the name of laptop
	 List<WebElement> alllaptops=driver.findElement(By.xpath("")).click();
	 //identify the price of laptop
	List<WebElement> allPrices=driver.findElement(By.xpath("")).click();;
	for(int i=0;i<alllaptops.size();i++)
	{
	String laptp = alllaptops.get(i).getText();
	Thread.sleep(2000);
	
	for(int j=i;j<=i;j++)
	{
	String price = allPrices.get(j).getText();
	Thread.sleep(2000);
	System.out.println(laptop+" : "+price);
	}
	}
	
		
	}
	
	}


