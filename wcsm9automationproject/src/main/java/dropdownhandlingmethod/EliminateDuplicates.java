package dropdownhandlingmethod;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicates {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/HP/OneDrive/Desktop/html/dropdown.html");
	//identify dropDown and store it in referance variable
	 WebElement menuDropdown=driver.findElement(By.id("Iddd"));
	 //get all option of menu dropDown
	 Select sel = new Select(menuDropdown);
	 List<WebElement>allops=sel.getOptions();
	 //to eliminate duplicate
	 HashSet<String>hs=new HashSet<String>();
	 //read
	 for(int i = 0; i<allops.size(); i++);
	 {
		WebElement op=allops.get(i);
		 //get the text of webElement
		 String dropDownoption=op.getText();
		 //add the text into HashSet and remove duplicates from DropDown
		 hs.add(dropDownoption);
	 }
	 Thread.sleep(2000);
	 //read the option from HashSet by using for each loop
	 for(String opt:hs)
	 {
		 Thread.sleep(2000);
		 System.out.println(opt);
		 
		 }
	
	}

}
