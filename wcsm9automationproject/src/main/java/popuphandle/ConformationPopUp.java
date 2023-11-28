package popuphandle;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConformationPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/progress");
		
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		//generate the pop up
		//handle conformation
		Alert conform=driver.switchTo().alert();
		Thread.sleep(2000);
		//accept conformation method popup
		
		//print the text of conformation  pop up
		String textOfconformationPopUp=confirm.getText();
	}

}
