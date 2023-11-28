package popuphandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopup {
	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable.notification");
		WebDriver driver =new ChromeDriver(co);
		FirefoxOptions fo=new FirefoxOptions();
		fo.addArguments("--disable.notification");
		WebDriver driver2=new FirefoxDriver(fo);
		
	}

}
