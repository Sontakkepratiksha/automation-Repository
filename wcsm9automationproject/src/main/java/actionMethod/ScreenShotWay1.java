package actionMethod;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay1 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/");
		ChromeDriver driver2=new ChromeDriver();
		 
		// take screenshot of web page
         driver.getScreenShotAs()
			
		File dest= new File("./screenshot/selenium.png");
		Files.copy(src,dest);
				
				
		File src= driver.getScreenShotAs(OutputType.FILE);		
				
	}

}
