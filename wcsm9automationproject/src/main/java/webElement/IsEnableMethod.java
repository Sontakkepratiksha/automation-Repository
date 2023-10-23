package webElement;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethod {
	public static void main(String[] args) {
		//verify the login button an instagram
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/");
		
		//identify username and password input
		driver.findElement(By.xpath("//input[ contains(@aria-label,\"Phone number\")]")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[ contains(@aria-label,\"Password\")]")).sendKeys("pass@123");
		//verify the login button 
		WebElement loginButtonElement=driver.findElement(By.xpath("//button[contains(@class,\"_acan _acao _acat _aj1-\")]"));
		//verify login button is disable or enable
		boolean status=loginButtonElement.isEnabled();
		System.out.println(status);
		//will click on button by using click method
		loginButtonElement.click();
				
		
		
	}

}
