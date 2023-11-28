package actionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class HandleDisableMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		//explicit type casting into JavascriptExecutor
	driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
	
	//explicit type casting name text box
	JavascriptExecutor jse =(JavascriptExecutor)driver;
	
	//handle disable name text box
	Thread.sleep(2000);
	jse.executeScript("document.getElementById('name').value='pratiksha'");
	
	//handle disable email text box
	Thread.sleep(2000);
	jse.executeScript("document.getElementById('email').value='pratikshasontakke72@gmail.com'");
	
	//handle disable password text box
	Thread.sleep(2000);
	jse.executeScript("document.getElementById('password').value='pratiksha@31'");
	
	//click on disable register button
 WebElement disableragisterbutton = driver.findElement(By.xpath("//button[text()='Register']"));
 if(disableragisterbutton.isDisplayed())
 {
	jse.executeScript("agruments[0].click()",disableregisterbutton);
 }
	
	
	}

}
