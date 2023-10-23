package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShooperStack {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.get("https://www.shoppersstack.com/");
	

	//Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@alt=\"SAMSUNG Galaxy Z Flip4 \"]")).click();
	
	driver.findElement(By.id("Check Delivery")).sendKeys("411033");
	//apply explicit wait
	//WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	// WebElement ele= wait.until(ExpectedConditions.elementToBeClickable(By.id("ch5e")));
	//ele.click();
	WebElement chekButton = driver.findElement(By.id("check"));
	explicitWait(driver, 30, chekButton).click();
	} 
	public static  WebElement explicitWait  (WebDriver driver, long sec,WebElement ele)
	{
	WebDriverWait	wait= new WebDriverWait(driver, Duration.ofSeconds(sec));
	 WebElement element= wait.until(ExpectedConditions.elementToBeClickable(ele));
	return element;
	}
}
