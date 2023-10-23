package methodsofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
	public static void main(String[] args) throws InterruptedException {
		//launch the chrome browser
	WebDriver driver=new ChromeDriver();
	//maximize the webapplication
	driver.manage().window().maximize();
	//launch the webapplication
	driver.get("https://cameyo.com/blog/");
	//get the title of current webpage
	//string title of page = driver.getTitle();
	//System.out.println(title of page);
	System.out.println(driver.getTitle());
	//stop the execution of script for 2 sec
	Thread.sleep(2000);
	//click on open a pop window link...
	driver.findElement(By.partialLinkText("Open a popup window")).click();
	//close the webapplication
	driver.close();
	//quit the webapplication
	driver.quit();
	
	}

}
