package dropdownhandlingmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedMethod {
	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("file:///C:/Users/HP/OneDrive/Desktop/html/dropdown.html");
    //single select dropdown
    WebElement dropDown1 = driver.findElement(By.id("iddd"));
    //handle the dropDown
    Select sel1=new Select(dropDown1);
    //select the option from dropDown
    Thread.sleep(2000);
    sel1.selectByValue("v1");
    Thread.sleep(2000);
    //get the option  which is selected first
    WebElement firstopt=sel1.getFirstSelectedOption();
    //get the text of first opt
    System.out.println(firstopt.getText());
    
    // multiselect
    driver.navigate();to
  
 //multiselect identify dropdown
    WebElement dropDown2 = driver.findElement(By.id(""));
    //handle the multiselect dropdown
    Select sel2=new Select(dropDown2);
    //select multiple option from multiselect dropDown
    for (int i =5; i<8; i++)
    {
    	Thread.sleep(2000);
    	sel2.deselectByIndex(i);
    }
    //get option which is selected first
    System.out.println(sel2.getFirstSelectedOption().getText());
    }
    
    		
	}

}
