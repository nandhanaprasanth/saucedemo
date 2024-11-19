package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Homepage {
	WebDriver driver;
public Homepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
@Test
public void locate()
{
	List<WebElement>addtocartbuttons=driver.findElements(By.xpath("//button[contains(text(),'Add to cart')]"));
    // Click on each "Add to Cart" button
    for (WebElement button:addtocartbuttons) {
        button.click();
    }


}}
