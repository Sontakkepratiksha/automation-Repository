package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TasksPage {
	//store all the WebElements of TasksPage
	
	@FindBy(partialLinkText ="Project & Customer")
	private WebElement Project_Customers_Sub_Module;
	@FindBy(xpath="")
	private WebElement Create_new_Customer_Button;
	@FindBy(xpath="")
	private WebElement Create_new_Project_Button;
	
	@FindBy(name= "name")
	private WebElement customer_nameTB

}
