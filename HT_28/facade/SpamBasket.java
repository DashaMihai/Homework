package facade;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpamBasket {
	private WebDriver driver;
	 
	 public SpamBasket(WebDriver webdriver)
	    {
	        PageFactory.initElements(webdriver, this);
	        this.driver = webdriver;
	    }
	
	

	@FindBy(xpath = "(//*[@data-id='950'])[1]")
	    private WebElement buttonSpam;
	 
	  public void clickButtonSpam()
	    {
	    	buttonSpam.click();
	    }

}
