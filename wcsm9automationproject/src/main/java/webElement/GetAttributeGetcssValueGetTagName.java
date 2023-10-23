package webElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeGetcssValueGetTagName {
	public static void main(String[] args) throws InterruptedException {
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   
   //get the attribute value of username textbox i.e name attribute
  WebElement usnTB = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
        usnTB.sendKeys("admin");
        Thread.sleep(2000);
 WebElement passTB = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
       passTB.sendKeys("pass123");
	}
	
}