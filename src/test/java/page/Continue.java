package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Continue {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"first-name\"]")
	WebElement firstname;
	@FindBy(xpath="//*[@id=\"last-name\"]")
	WebElement lastname;
	@FindBy(xpath="//*[@id=\"postal-code\"]")
	WebElement zip;
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement continuebtn;
	
	
	public Continue(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void setvalues(String firstname1,String lastname1,String zip1)
	{
		firstname.sendKeys(firstname1);	
		lastname.sendKeys(lastname1);
		zip.sendKeys(zip1);	
	}
	public void clickcontinue()
	{
		continuebtn.click();
	
	}
}
