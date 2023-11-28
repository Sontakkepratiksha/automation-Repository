package keyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActitimeInvalidTestLogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//to lounch the browser and close the browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		//to launch the data from excel file
		Flib flib = new Flib();
		int rc = flib.rowCount("./src/main/resources/actitimeTestData.xlsx","invalidcreads");
		
		for(int i=1;i<=rc;i++)
		{
	    String invalidUsn = flib.readDataFromExcel("./src/main/resources/actitimeTestData.xlsx","invalidcreads", i ,0);
		String invalidPass = flib.readDataFromExcel("./src/main/resources/actitimeTestData.xlsx","invalidcreads", i, 1);
		
		//identify username Textbox
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys(invalidUsn);
		//identify password text box
		WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys(invalidPass);
		//identify login Button and click
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		
        }
         bt.closeBrowser();
	}
}
