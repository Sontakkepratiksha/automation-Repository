package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.instagram.com/");
	//Thread.sleep(2000);
	
	//identify username tb
	driver.findElement(By.name("username")).sendKeys("pr.atiksha7596");
	
	//identify password tb
	driver.findElement(By.name("password")).sendKeys("71619400");
	
	//identify login Button
	driver.findElement(By.xpath("//div[text()='Log in']")).click();
	
	
	}
	

}
