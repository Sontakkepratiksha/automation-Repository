package methodsofwebdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	//get the title of current webpage
	//string title of page = driver.getTitle();
	//system.out.println(title of page);
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.quit();
	}

}
