package junitcucumber;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mail3FlagSteps {
	private static final String MAIN_URL = "http://mail.ru";
	private static final String CHROMEDRIVER_EXE = "D:\\selenium\\chromedriver.exe";
	private static final String LOGIN = "dashamihai";
	private static final String PASSWORD = "dasha2912900";
	private Mail3Flag flagMessage;
	private WebDriver webDriver;

	public Mail3FlagSteps() {
		String exePath = CHROMEDRIVER_EXE;
		System.setProperty("webdriver.chrome.driver", exePath);
		webDriver = new ChromeDriver();
		flagMessage = new Mail3Flag(webDriver);

	}

	@Given("^I am on main application page 3$")
	public void loadMainPage() {
		webDriver.get(MAIN_URL);
	}

	@When("^I login as correct user 3$")
	public void loginAsCorrectUser() {
		flagMessage.enterLoginAndPass(LOGIN, PASSWORD);
		flagMessage.clickEnterButton();
	}

	@When("^I click flag 1 letter$")
	public void flagButton1() {

		flagMessage.clickFlag1();
	}
	
	@When("^I click flag 2 letter$")
	public void flagButton2() {

		flagMessage.clickFlag2();
	}

	@When("^I click flag 3 letter$")
	public void flagButton3() {

		flagMessage.clickFlag3();
	}
	
	@When("^I click flag button$")
	public void flagButton() {

		flagMessage.clickFlagButton();
	}
	
	@Then("I see mails marked with a flag")
	public void seeMessage() {
		Assert.assertTrue(flagMessage.flagMessagePresents());
	}

	@After
	public void afterClass() {
		webDriver.quit();
	}

}
