import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles 
{
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/"); 
	Thread.sleep(2000);
	String parentHandle=driver.getWindowHandle();
	System.out.println(parentHandle);
	System.out.println("address of parentBrowser or window"+parentHandle);
    Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Open a popup window")).click();
	//get the address of parent browser as we child 
	       Set<String> allHandles=driver.getWindowHandles();
	       //print the address of browser use for each loop
	       
	       for (String wh:allHandles)
	       {
	    	   //System.out.println("part Handle :"+ wh +"child
	    	   if (! parentHandle.equals(wh))
	    	   {
	    		  System.out.println("address of parent window:" + (wh));
	    	   }
	    	   else
	    	   {
	    		  System.out.println(" address of child window:" + (wh));
	    	   }
	    	   }
	}
}
	  
