package page;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage
	{
	    @FindBy(id = "mailbox:login")
	    private WebElement loginField;

	    @FindBy(id = "mailbox:password")
	    private WebElement passwordField;

	    @FindBy(xpath = "//*[@id='mailbox:submit']/input")
	    private WebElement buttonEnter;

	    @FindBy(xpath = "//*[@id='PH_logoutLink']")
	    private WebElement logoutLink;

	    public LoginPage(WebDriver webdriver)
	    {
	        PageFactory.initElements(webdriver, this);
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

	    public boolean logoutLinkPresents()
	    {
	        return logoutLink.isDisplayed();
	    }
	}
