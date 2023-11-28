package popuphandle;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		
		//handle alert PopUp
		Alert alert=driver.switchTo().alert();
		//accept 
		Thread.sleep(2000);
		alert.accept();
	String textofalert=alert.getText();
	System.out.println(textofalert);
	//alert.sendkeys
	//sendkeys("pratiksha")
	//dismiss alert PopUp
	alert.dismiss();
	}
	
	


}
