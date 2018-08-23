package junitcucumber;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MailInSpamSteps {
	private static final String MAIN_URL = "http://mail.ru";
	private static final String CHROMEDRIVER_EXE = "D:\\selenium\\chromedriver.exe";
	private static final String LOGIN = "dashamihai";
	private static final String PASSWORD = "dasha2912900";
	private MailInSpam spamMessage;
	private WebDriver webDriver;

	public MailInSpamSteps() {
		String exePath = CHROMEDRIVER_EXE;
		System.setProperty("webdriver.chrome.driver", exePath);
		webDriver = new ChromeDriver();
		spamMessage = new MailInSpam(webDriver);
		
	}

	@Given("^I am on main application page 10$")
	public void loadMainPage() {
		webDriver.get(MAIN_URL);
	}

	@When("^I login as correct user 10$")
	public void loginAsCorrectUser() {
		spamMessage.enterLoginAndPass(LOGIN, PASSWORD);
		spamMessage.clickEnterButton();
	}

	@When("^I click check-box mail$")
	public void checkboxMessage1() {

		spamMessage.clickCheckboxMessage1();
	}
	@When("^I click button Spam$")
	public void spamButton() {

		spamMessage.clickSpamButton();
	}
	
	@Then("I see message Mail successfully moved to spam")
	public void seeMessage() {
		Assert.assertTrue(spamMessage.MessageInSpamPresents());
	}
	
	@After 
	public void afterClass() {
		webDriver.quit();
	}

}
