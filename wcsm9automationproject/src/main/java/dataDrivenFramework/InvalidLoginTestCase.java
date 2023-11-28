package dataDrivenFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase extends Flib {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://pratikshasontakke/login.do");
		
		Flib flib = new Flib();
		flib.ro
		 for(int i=1;i<=rc; i++) {
			String usnData=flib.readexcelData("./src/main/resources/actitimeaTestData.xlsx","InvalidCreads",i, 0);
			String pwdData=flib.readexcelData("./src/main/resources/actitimeaTestData.xlsx","InvalidCreads",i, 1);
			
			driver.findElement(By.name("username")).sendKeys(usnData);
			driver.findElement(By.name("pwd")).sendKeys(pwdData);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
		 }
	}

}
