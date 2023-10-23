package dropdownhandlingmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsMultipleMethod {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	//single select Dropdown
	driver.findElement(By.xpath(""))
	
	
	}
}
