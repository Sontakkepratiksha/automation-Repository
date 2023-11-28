package actionMethod;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotandActionMethodonbluestone {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		
		//watch jewellary 
		WebElement WatchJewellaryTarget =driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		Actions.act = new Actions(driver);
		
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		
		//copy the filter by text
		
		//past the 
			
		}
	}
	
