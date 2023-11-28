package popuphandle;

import java.sql.Driver;
import java.util.Scanner;

import javax.swing.text.html.Option;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopupScript {
	static WebDriver driver;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String browserValue=sc.next();
		
		if(browserValue.equalsIgnoreCase("Chrome"));
		{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable notification");
		Thread.sleep(2000);
		driver=new ChromeDriver(co);
	    }
		else if(browserValue.equalsIgnoreCase("FireFox"));
		{
		FirefoxOptions fo=new FirefoxOptions();
		fo.addArguments("--disable notification");
		Thread.sleep(2000);
		driver=new FirefoxDriver(fo);
					}
		else if(browserValue.endsWith("edge"));
		{
		EdgeOptions eo=new EdgeOptions();
		eo.addArguments("--disable notification");
		Thread.sleep(2000);
		driver=new EdgeDriver(eo);
		}
		else if 
		{
		System.out.println("enter valid browser");
		}

	    driver.get("https://www.makemytrip.com/railways/");
	    }
}
