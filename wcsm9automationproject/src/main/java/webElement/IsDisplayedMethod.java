package webElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {


	//verify the logout link in home page of activate
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Program%20Files%20(x86)/actiTIME/actitime/userguide/index.html");
		
		//idenntify username text box and pass admin
		driver.findElement(By.xpath("username")).sendKeys("admin");
		//identify password text box and pass manager
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//identify login button and click
		driver.findElement(By.id("loginButton")).click();
		//identify logout link for verify
		WebElement logoutLinkElement=driver.findElement(By.partialLinkText("logout"));
		//check for logout link element is displayed or not
		boolean status=logoutLinkElement.isDisplayed();
	    System.out.println(status);
	
		
		
		
		
	}

}
