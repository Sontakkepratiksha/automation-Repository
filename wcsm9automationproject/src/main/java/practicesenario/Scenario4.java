package practicesenario;

import java.sql.Driver;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario4 {
	static WebDriver driver;
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("");
		
		String browserValue=sc.next();
		if (browserValue.equalsIgnoreCase("chrome"));
		{
			driver=new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("firefox"));
		{
			driver=new FirefoxDriver();
		}
		else if(browserValue.equalsIgnoreCase("edge"));
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("This is not a browserValue!!");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("\"https://www.amazon.in/\"");
		}
		
}

	
