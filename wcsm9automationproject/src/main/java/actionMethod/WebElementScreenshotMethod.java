package actionMethod;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WebElementScreenshotMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		driver.findElement(By.xpath("//a[text()='Coins ']//a[text()='Coins ']")).click();
		
		
		//take screenshot of coin element
		WebElement coinelement = driver.findElement(By.xpath("//img[@class='hc img-responsive center-block']s")).click();
		File src=coinelement.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/selenium.png");
		Files.copy(src,dest);
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
	}

}
