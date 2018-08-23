package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExistIcons {
	 private WebDriver driver;
	 @FindBy(xpath = "//*[@id='projects']")
	    private WebElement existIcons;
	    
	  public ExistIcons(WebDriver webdriver)
	    {
	        PageFactory.initElements(webdriver, this);
	        this.driver = webdriver;
	    }
	    
	    public boolean existIconsPresents()
	    {
	        return existIcons.isDisplayed();
	}

}
