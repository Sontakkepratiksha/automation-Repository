package webElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("http://desktop-vpavpgk/login.do");
 
driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
 driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
driver.findElement(By.xpath("id=\"loginButton\"")).click();

}
}