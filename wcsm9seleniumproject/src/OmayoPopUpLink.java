import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoPopUpLink {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Open a popup window")).click();
	Thread.sleep(2000);
	String parentHandle=driver.getWindowHandle();
	System.out.println(parentHandle);
	String childHandle=driver.getWindowHandle();
	System.out.println(childHandle);
	driver.quit();
	
		
		
	}

}
