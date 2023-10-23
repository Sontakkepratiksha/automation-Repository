package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//apply implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flipkart.com/");
	//Thread.sleep(2000);
	//username
	driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
	//password
	driver.findElement(By.xpath("//a[@class='_1krdk5' and (@title='Cart')]")).click();
	//logi
	driver.findElement(By.xpath("//button[contains(@class,'_2')]")).click();
	//get the address of all the windows
	//Thread.sleep(4000);
	
	}
}
