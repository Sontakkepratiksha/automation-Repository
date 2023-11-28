package pageobjectmodel;



public class ActiTimeValidLogin extends BaseTest{
	public static void main(String[] args) {
     //to open &close browser
		BaseTest bt = new BaseTest();
       bt.setUp();
		
		
		
   
     //get the web element from login page pom class
      LoginPage lp=new LoginPage(driver);
      //read data from excel sheet
      Flib. flib= new Flib();
      //read row count
      int rc = flib.rowCount(EXCEL_PATH, INVALIDCREEDS_SHEET);

      for(int i=1;i<=rc;i++)
      {
      //get the method to perform invalid loginPage pom class
      lp.invalidLogin(flib.readDataFromExcel(EXCEL_PATH, INVALIDCREADS_SHEET,i,0),flib.readData
      }
      bt.tearDown();
      }