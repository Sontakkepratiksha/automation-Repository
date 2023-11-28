package actionMethod;

import java.awt.Point;
import java.io.File;
import java.time.Duration;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class OmayoDisableScrollScreenShot {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		 WebElement disabletextbox = driver.findElement(By.id("tb2"));
		org.openqa.selenium.Point loc = disabletextbox.getLocation();
		int xaxis=loc.getX();
		int yaxis=loc.getY();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(+xaxis+)","(yaxis-40)+");
		jse.executeScript(Document.get)
		
		
		
	}
}
