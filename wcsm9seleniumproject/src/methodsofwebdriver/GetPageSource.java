package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.codec.http.HttpClientUpgradeHandler.SourceCodec;

public class GetPageSource {
	public static void main(String[] args) throws InterruptedException {
     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://cameyo.com/blog/");
     Thread.sleep(2000);
     String loginpageSorceCode =driver.getPageSource();
     Thread.sleep(2000);
     driver.quit();             
	}

}


