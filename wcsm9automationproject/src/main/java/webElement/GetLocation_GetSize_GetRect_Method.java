package webElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_GetSize_GetRect_Method {
public static void main(String[] args) throws InterruptedException {
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  
 driver.get("http://demoapps.qspiders.com/");
 Thread.sleep(2000);
 driver.findElement(By.xpath("//input[@placeholder=\"Enter your name\"]")).sendKeys("admin");
 
 driver.findElement(By.xpath("//input[@placeholder=\"example@gmail.com\"]")).sendKeys("admin123@gmail.com");
 
 
 driver.findElement(By.xpath("//input[@placeholder=\"Enter your password\"]")).sendKeys("pass@123");
 
 driver.findElement(By.xpath("//a[@type=\"button\"]")).click();
 
 driver.findElement(By.xpath("//input[@placeholder=\"example@gmail.com\"]")).sendKeys("admin123@gmail.com");
 
 driver.findElement(By.xpath("//input[@placeholder=\"Your password\"]")).sendKeys("pass@123");
 
 driver.findElement(By.xpath("//span[text()='Register']")).click();
}
	

}
