package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeDriver {
	
	public static void main(String[] args) throws InterruptedException {
		
		//to launch chromeDriver ();
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 System.out.println("Chrome is Open!!");
		 Thread.sleep(2000);
		 
		 //How to close Chrome Browser
		 
		 driver.close();
		 System.out.println("Chrome is close!!");
	}

	}


