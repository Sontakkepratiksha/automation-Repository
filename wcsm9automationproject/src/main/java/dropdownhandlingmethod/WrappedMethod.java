package dropdownhandlingmethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WrappedMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/HP/OneDrive/Desktop/html/dropdown.html");
	//single select dropDown
	WebElement dropdown1=driver.findElement(By.id("Iddd"));
	//handle dropDown
	Select sel=new Select(dropdown1);
	//get all the options from dropDown by using get wrapped element
	WebElement allops=sel.getWrappedElement();
	System.out.println(allops.getText());
	//get all the options from dropDown by using get options
	List<WebElement>options=sel.getOptions();
	for (WebElement opt:options)
	{
		Thread.sleep(2000);
		System.out.println(opt.getText());
	}
	}

}
