package pageobjectmodel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//div[text()='Time-Track']/following-sibling::div/img") private WebElement Time_Module;
	@FindBy(xpath="//div[text()='Tasks']/following-sibling::div/img")private WebElement Tasks_Module;
	@FindBy(xpath="//div[text()='Reports']/following-sibling::div/img")private WebElement Report_Module;
	@FindBy(xpath="//div[text()='Users']/following-sibling::div/img")private WebElement Users_Module;
	@FindBy(xpath="//div[text()='Work Schedule']/following-sibling::div/img")private WebElement WorkShedule_Module;
	@FindBy(xpath="//div[text()='Settings']/following-sibling::div/img")private WebElement Settings_Module;
	@FindBy(xpath="//a[text()='Logout']")private WebElement Logout_Button;
	
	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getTime_Module() {
		return Time_Module;
	}

	public WebElement getTasks_Module() {
		return Tasks_Module;
	}

	public WebElement getReport_Module() {
		return Report_Module;
	}

	public WebElement getUsers_Module() {
		return Users_Module;
	}

	public WebElement getWorkShedule_Module() {
		return WorkShedule_Module;
	}

	public WebElement getSettings_Module() {
		return Settings_Module;
	}

	public WebElement getLogout_Button() {
		return Logout_Button;
	}
	
	
	//operational method
	public void click_on_Task_module()
	{
		Users_Module.click();
	}
}
	
	
	