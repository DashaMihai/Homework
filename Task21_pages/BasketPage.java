package junitcucumber;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasketPage {
	 private WebDriver driver;

	    @FindBy(id = "mailbox:login")
	    private WebElement loginField;

	    @FindBy(id = "mailbox:password")
	    private WebElement passwordField;

	    @FindBy(xpath = "//*[@id='mailbox:submit']/input")
	    private WebElement buttonEnter;

	    @FindBy(xpath = "//*[@data-id='500002']")
	    private WebElement basketButton;
	    
	   
	    
	    @FindBy(xpath = "(//*[text()='Очистить папку'])[5]")
	    private WebElement cleanFolderButton;

	    @FindBy(xpath = "//*[text()='Да']")
	    private WebElement yesButton;
	    
	    @FindBy(xpath = "//*[text()='В Корзине пусто.']")
	    private WebElement emptyBasketLink;
	   
	    public BasketPage(WebDriver webdriver)
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
    public void clickBasketButton()
	    {
	        basketButton.click();
	    }
	 
	    public void clickCleanFolderButton()
	    {
	    	cleanFolderButton.click();
	    }
	    public void clickYESButton()
	    {
	    	yesButton.click();
	    }
	    public boolean EmptyBasketLinkPresents()
	    {
	        return emptyBasketLink.isDisplayed();
	    }
	  
}
