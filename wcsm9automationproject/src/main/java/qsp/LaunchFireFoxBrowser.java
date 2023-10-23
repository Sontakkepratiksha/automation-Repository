package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LaunchFireFoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TO launch FireFoxDriver ();
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().minimize();
		System.out.println("FireFox is open!!");
		Thread.sleep(2000);
		
		//How to close FireFox Browser
		
		driver.close();
		System.out.println("Firefox is close!!");

	}

}
