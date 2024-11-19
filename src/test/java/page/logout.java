package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
	WebElement menu;

	@FindBy(xpath="/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]")
	WebElement logout;
	public logout(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void signout()

	{
		menu.click();	
		logout.click();
		
		
	}
	
}
