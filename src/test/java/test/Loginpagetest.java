package test;
import org.testng.annotations.Test;
import Base.Baseclass;
import page.CartandCheckout;
import page.Continue;
import page.Homepage;
import page.Loginpage;
import page.logout;
import utilities.Excel_utilities;
public class Loginpagetest extends Baseclass {
	@Test
	public void testing() throws InterruptedException
	{
	Loginpage ob=new Loginpage(driver);
		//reading the data from excel file by the specified path
		String xl="C:\\Users\\nandh\\OneDrive\\Desktop\\luminar_DD\\saucedemo.xlsx";
		String sheet="Sheet1";
		int rowCount=Excel_utilities.getRowCount(xl,sheet);
		System.out.println(rowCount);
		for(int i=1;i<=rowCount;i++)
		{
			String UserName=Excel_utilities.getCellValue(xl, sheet, i, 0);
			System.out.println("username...."+UserName);
			String pwd=Excel_utilities.getCellValue(xl, sheet, i, 1);
			System.out.println("password...."+pwd);
			
			//passing username and password as parameters
			ob.setvalues(UserName,pwd);
			
			//submitting the data by clicking on login button
			
			ob.loginbuttonclick();
		
			String expectedurl="https://www.saucedemo.com/inventory.html";
			String actualurl=driver.getCurrentUrl();
			if(actualurl.equals(expectedurl))
					{
				System.out.println("pass");
				Homepage ob1=new Homepage(driver);
				ob1.locate();
				
				CartandCheckout ob2=new CartandCheckout(driver);
				ob2.clickcart();
				ob2.clickcheckout();
				
				Continue ob3=new Continue(driver);
				ob3.setvalues("abcd","efgaa","345454");
				ob3.clickcontinue();
				
				logout ob4=new logout(driver);
				ob4.signout();
			
					}
			else
				System.out.println("fail,not expected url");
		}
		
	}
}
