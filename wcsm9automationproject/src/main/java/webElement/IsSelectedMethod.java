package webElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.meesho.com/");
		
		//identify check box or verify
		WebElement checkBoxElement=driver.findElement(By.xpath("//div[@name=\"Kurtis\"]"));
		
		//check the checkbox is selected or not
		boolean status=checkBoxElement.isSelected();
		System.out.println(status);
	}
}                                                                                                                                                                                                                  
                  