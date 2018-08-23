package junitcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailInSpam {
	private WebDriver driver;
	@FindBy(id = "mailbox:login")
	private WebElement loginField;

	@FindBy(id = "mailbox:password")
	private WebElement passwordField;

	@FindBy(xpath = "//*[@id='mailbox:submit']/input")
	private WebElement buttonEnter;

	@FindBy(xpath = "(//*[@class='b-checkbox__box'])[10]")
	private WebElement checkboxMessage1;

	@FindBy(xpath = "(//*[text()='Спам'])[1]")
	private WebElement spamButton;

	@FindBy(xpath = "//a[text()='Отменить']")
	private WebElement messageSpamLink;

	public MailInSpam(WebDriver webdriver) {
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

	public void clickCheckboxMessage1() {
		(new WebDriverWait(driver, 15)).until(ExpectedConditions.visibilityOf(checkboxMessage1)).click();
	}

	public void clickSpamButton() {
		spamButton.click();
	}

	public boolean MessageInSpamPresents() {
		return messageSpamLink.isDisplayed();
	}

}
