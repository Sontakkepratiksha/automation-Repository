package keyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActitimeValidLogIn extends BaseTest implements IautoConstant{
	public static void main(String[] args) throws IOException, InterruptedException {
		//launch the browser and close the browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		//to read data from property file
		Flib flib = new Flib();
	
		
		//identify username text box/
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys(flib.readDataFRomProperty(PROP_PATH,"Username"));
		System.out.println(usnTB);
		//identify password TextBox
		WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys(flib.readDataFRomProperty(PROP_PATH,"Password"));
		System.out.println(passTB);
		//identify login Button and click
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		
		bt.closeBrowser();
	}
		
		
	}

