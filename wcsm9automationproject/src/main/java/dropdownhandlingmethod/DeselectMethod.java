package dropdownhandlingmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectMethod {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("");
	
	WebDriver dropDown1=sel.SelectByIndex(2);
	//deselect the option from single select dropDown
	Thread.sleep(2000);
	//sel.deselectByIndex(2);
	//perform deselection on multiselect dropdown
	driver.findElement(By.partialLinkText("multiselect")).click();
	//identify dropdown that is multiselect
	WebElement dropDown2=driver.findElement(By.id(""));
	Select sel2=new Select(dropDown2);
	
	//select and deselect option by using index 
	
	Thread.sleep(2000);
	
	 for(int i=0; i<=4; i++)
	 {
		 Thread.sleep(2000);
		 sel2.deselectByIndex(i);
	 }
	 
	 //select and deselect option by using value
	 
	 sel2.SelectByvalue("");
	 Thread.sleep(2000);
	 sel2.deselectByValue("");
}

//select and deselect option by using visible text
     sel2.selectByVisibleText("");
     thread.sleep(2000);
     sel2.deselectByvalue("");
     sel2.deselectByVisibleText("");
     

	
	
	
	
	}

}
