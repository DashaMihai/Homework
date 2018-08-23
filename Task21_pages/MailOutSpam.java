package junitcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailOutSpam {
 private WebDriver driver;
 @FindBy(id = "mailbox:login")
	private WebElement loginField;

	@FindBy(id = "mailbox:password")
	private WebElement passwordField;

	@FindBy(xpath = "//*[@id='mailbox:submit']/input")
	private WebElement buttonEnter;
	
	 @FindBy(xpath = "//*[@data-id='950']")
	    private WebElement buttonSpam;
	    
	    @FindBy(xpath = "(//*[@class='b-checkbox__box'])[43]")
	    private WebElement checkboxMessage;    
	    
	    @FindBy(xpath = "(//*[text()='Не спам'])[1]")
	    private WebElement spamButton;
	    
	    @FindBy(xpath = "//span[text()='Письмо перемещено в папку «Входящие»']")
	    private WebElement messageOutSpamLink;
	    
	    public MailOutSpam(WebDriver webdriver)
	    {
	        PageFactory.initElements(webdriver, this);
	        this.driver = webdriver;
	    }
	    public void enterLoginAndPass(String login, String password) {
			loginField.clear();
			loginField.sendKeys(login);
			passwordField.clear();
			passwordField.sendKeys(password);

		}

		public void clickEnterButton() {
			buttonEnter.click();
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
