package dropdownhandlingmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {
	public static void main(String[] args) throws InterruptedException {
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("http://demoapps.qspiders.com/");
 
//identify Dropdown option & click
driver.findElement(By.xpath("//section[text()=\"Dropdown\"]")).click();
//identify in ph no Dropdown
WebElement dropdown1 = driver.findElement(By.xpath("//select[contains(@class,' transition-all duration-150 w-5/12')]"));
Select sel1=new Select(dropdown1);
//select the option
sel1.selectByIndex(4);
//identify country Dropdown
WebElement dropdown2 = driver.findElement(By.xpath("//label[text()=\"Country\"]/following-sibling::select "));
Select sel2= new Select(dropdown2);
Thread.sleep(2000);
sel2.selectByValue("Canada"); 

//identify state dropdown
WebElement dropdown3 =driver.findElement(By.xpath("//label[text()='State']/following-sibling::select")); 
Select sel3= new Select(dropdown3);
Thread.sleep(2000);
sel3.selectByVisibleText("Maharashtra");
}

}
