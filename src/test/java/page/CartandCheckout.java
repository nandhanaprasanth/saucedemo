package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CartandCheckout {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement cart;
	@FindBy(xpath="//*[@id=\"checkout\"]")
	WebElement checkout;
	
	public CartandCheckout(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	public void clickcart()
	{
		cart.click();
	}
	public void clickcheckout()
	{
		checkout.click();
	}
}
