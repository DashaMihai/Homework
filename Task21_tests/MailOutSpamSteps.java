package junitcucumber;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MailOutSpamSteps {
	private static final String MAIN_URL = "http://mail.ru";
	private static final String CHROMEDRIVER_EXE = "D:\\selenium\\chromedriver.exe";
	private static final String LOGIN = "dashamihai";
	private static final String PASSWORD = "dasha2912900";
	private MailOutSpam outSpamMessage;
	private WebDriver webDriver;

	public MailOutSpamSteps() {
		String exePath = CHROMEDRIVER_EXE;
		System.setProperty("webdriver.chrome.driver", exePath);
		webDriver = new ChromeDriver();
		outSpamMessage = new MailOutSpam(webDriver);

	}

	@Given("^I am on main application page 1$")
	public void loadMainPage() {
		webDriver.get(MAIN_URL);
	}

	@When("^I login as correct user 1$")
	public void loginAsCorrectUser() {
		outSpamMessage.enterLoginAndPass(LOGIN, PASSWORD);
		outSpamMessage.clickEnterButton();
	}

	@When("^I click spam$")
	public void spamButton() {

		outSpamMessage.clickButtonSpam();
	}

	@When("^I click check-box spam mail$")
	public void deleteButton() {

		outSpamMessage.clickCheckboxMessage();
	}

	@When("^I click button Not spam$")
	public void notSpamButton() {

		outSpamMessage.clickNotSpamButton();
	}

	@Then("I see message Mail successfully moved to the inbox")
	public void seeMessage() {
		Assert.assertTrue(outSpamMessage.MessageOutSpamPresents());
	}

	@After
	public void afterClass() {
		webDriver.quit();
	}

}
