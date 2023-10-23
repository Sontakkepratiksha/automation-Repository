package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xPath {
	public static void main(String[] args) throws InterruptedException {
		//handal notification pop in chrome browser
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--disable-notifications");
	}
	WebDriver driver=new ChromeDriver(co); 
	
	driver.manage().window().maximize();
	driver.get("https://www.airvistara.com/in/en");
			
	driver.findElement(By.id(""))		
	Thread.sleep(2000);
	
	driver.get("");
		
	

}
