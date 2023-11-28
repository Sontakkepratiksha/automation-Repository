package popuphandle;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		//generate authintication popup
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Authentication']")).click();
		driver.findElement(By.xpath("//a [text()='Login']")).click();
		
		//address of authentication page window 
		String authenticationhandle=driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("//a[@href='https://basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/']")).click();
		Thread.sleep(2000);
		//get the address of all parent window
	    Set<String>allwindowHandles=driver.getWindowHandles();
	    for(String wh:allwindowHandles)
	    {
	    	
			if(!authenticationpageWindowHandle.equal(wh))
	    	{
	    		driver.switchTo().window(wh);
	    		
	    	}
	    }
	    //handle authentication popup
	    handle_authentication_popup();
	    
	}
	public static void handle_authentication_popup() {
		{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		}
		
	}

}
