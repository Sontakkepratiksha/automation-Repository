package actionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotRightClick {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		//identify selenium level sponser element
		//WebElement Selenium_Level_SponsersTarget = driver.findElement(By.xpath("//h2[text()='Selenium Level Sponsors']"));
		
		//Thread.sleep(2000);
		//Actions act = new Actions(driver);
		//act.contextClick(Selenium_Level_SponserTarget).build().Perform();
		
		
		//identify Getting Started element
		WebElement Getting_StartedTarget =driver.findElement("")
				Thread.sleep(0)
				//perform right click on getting action
				Actions act = new  Actions(Driver);
		      act.contextClick(Getting_StartedTarget)act.
		
	}

}
