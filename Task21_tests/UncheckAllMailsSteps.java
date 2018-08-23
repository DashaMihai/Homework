package junitcucumber;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UncheckAllMailsSteps {
	private static final String MAIN_URL = "http://mail.ru";
	private static final String CHROMEDRIVER_EXE = "D:\\selenium\\chromedriver.exe";
	private static final String LOGIN = "dashamihai";
	private static final String PASSWORD = "dasha2912900";
	private UncheckAllMails uncheckMessage;
	private WebDriver webDriver;

	public UncheckAllMailsSteps() {
		String exePath = CHROMEDRIVER_EXE;
		System.setProperty("webdriver.chrome.driver", exePath);
		webDriver = new ChromeDriver();
		uncheckMessage = new UncheckAllMails(webDriver);

	}

	@Given("^I am on main application page 4$")
	public void loadMainPage() {
		webDriver.get(MAIN_URL);
	}

	@When("^I login as correct user 4$")
	public void loginAsCorrectUser() {
		uncheckMessage.enterLoginAndPass(LOGIN, PASSWORD);
		uncheckMessage.clickEnterButton();
	}

	@When("^I click flag button$")
	public void buttonFlag() {

		uncheckMessage.clickFlagButton();
	}
	
	@When("^I click check-box all mails$")
	public void CheckboxAllMessages() {

		uncheckMessage.CheckboxAllMessages();
	}

	@When("^I click button more$")
	public void moreButton() {

		uncheckMessage.ClickmoreButton();
	}
	
	@When("^I click uncheck button$")
	public void uncheckButton() {

		uncheckMessage.ClickUncheckFlagButton();
	}
	
	@Then("I see empty message")
	public void seeMessage() {
		Assert.assertTrue(uncheckMessage.EmtyMessageLinkPresents());
	}

	@After
	public void afterClass() {
		webDriver.quit();
	}

}
