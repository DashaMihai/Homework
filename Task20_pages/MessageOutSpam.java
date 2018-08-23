package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class MessageOutSpam {
	 private WebDriver driver;
	 
	 @FindBy(xpath = "//*[@data-id='950']")
	    private WebElement buttonSpam;
	    
	    @FindBy(xpath = "(//*[@class='b-checkbox__box'])[43]")
	    private WebElement checkboxMessage;    
	    
	    @FindBy(xpath = "(//*[text()='Не спам'])[1]")
	    private WebElement spamButton;
	    
	    @FindBy(xpath = "//span[text()='Письмо перемещено в папку «Входящие»']")
	    private WebElement messageOutSpamLink;
	    
	    public MessageOutSpam(WebDriver webdriver)
	    {
	        PageFactory.initElements(webdriver, this);
	        this.driver = webdriver;
	    }
	   
	    public void clickButtonSpam()
	    {
	    	buttonSpam.click();
	    }
	    public void clickCheckboxMessage()
	    {
	    	(new WebDriverWait(driver, 15)).until(ExpectedConditions.visibilityOf(checkboxMessage)).click();
	    }
	    public void clickNotSpamButton()
	    {
	    	spamButton.click();
	    }
		 public boolean MessageOutSpamPresents() {
				return messageOutSpamLink.isDisplayed();
			}

}
