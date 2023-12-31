package actionMethod;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ScrollRightEnd {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		//perform scroll right end
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(5000,0)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(-5000,0)");

		
		//perform scroll left end
		JavascriptExecutor jse1=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse1.executeScript("window.scrollBy(-5000,0)");
		Thread.sleep(2000);
		jse1.executeScript("window.scrollBy(5000,0)");
	}

	}


