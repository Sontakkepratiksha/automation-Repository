package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://google.com/");
		driver.findElement(By.xpath("//a [@aria-label='Google apps']")).click();
		//before clicking on maps switch control to frame
		//identify frame and strore it as web element
		WebElement frameElement =driver.findElement(By.name("app"));
		Thread.sleep(2000);
		//
		
		//click on google app link
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
	}

}
