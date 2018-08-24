package junitcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DelMessage {
	private WebDriver driver;
	 @FindBy(id = "mailbox:login")
	    private WebElement loginField;

	    @FindBy(id = "mailbox:password")
	    private WebElement passwordField;

	    @FindBy(xpath = "//*[@id='mailbox:submit']/input")
	    private WebElement buttonEnter;
	    
	@FindBy(xpath = "(//*[@class='b-checkbox__box'])[8]")
    private WebElement checkboxMessage;

    @FindBy(xpath = "(//*[text()='�������'])[1]")
    private WebElement delMessageButton;
   
   @FindBy(xpath = "//a[text()='��������']")
    private WebElement messageLink;
   
    public DelMessage(WebDriver webdriver)
    {
        PageFactory.initElements(webdriver, this);
        this.driver = webdriver;
    }
    public void enterLoginAndPass(String login, String password)
    {
        loginField.clear();
        loginField.sendKeys(login);
        passwordField.clear();
        passwordField.sendKeys(password);

    }

    public void clickEnterButton()
    {
        buttonEnter.click();
    }
   
    public void clickCheckboxMessage() {
		(new WebDriverWait(driver, 15)).until(ExpectedConditions.visibilityOf(checkboxMessage)).click();
	}
    public void clickDelMessageButton()
    {
    	delMessageButton.click();
    }
    public boolean MessagePresents() {
		return messageLink.isDisplayed();
	}

}
