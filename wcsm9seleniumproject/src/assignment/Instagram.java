package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
public static void main(String[] args) throws InterruptedException  {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");
Thread.sleep(2000);

//identify usernameTexBox and pass inputs
driver.findElement(By.xpath("//input[contains(@name,'u')]")).sendKeys("admin");

//identify passwordTexBox and pass inputs
driver.findElement(By.xpath("//input[contains(@name,'p')]")).sendKeys("123456");

//identify loginButton and click
driver.findElement(By.xpath("//div[contains(text(),'L')]")).click();

Thread.sleep(2000);
driver.quit();

}
}
