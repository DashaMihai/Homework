package junitcucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DelMessageSteps {
	private static final String MAIN_URL = "http://mail.ru";
	private static final String CHROMEDRIVER_EXE = "D:\\selenium\\chromedriver.exe";
	private static final String LOGIN = "dashamihai";
	private static final String PASSWORD = "dasha2912900";
	private DelMessage delMessage;
	private WebDriver webDriver;

	public DelMessageSteps() {
		String exePath = CHROMEDRIVER_EXE;
		System.setProperty("webdriver.chrome.driver", exePath);
		webDriver = new ChromeDriver();
		delMessage = new DelMessage(webDriver);
		
	}

	@Given("^I am on main application page 5$")
	public void loadMainPage() {
		webDriver.get(MAIN_URL);
	}

	@When("^I login as correct user 5$")
	public void loginAsCorrectUser() {
		delMessage.enterLoginAndPass(LOGIN, PASSWORD);
		delMessage.clickEnterButton();
	}

	@When("^I click check-box message$")
	public void checkboxMessage() {

		delMessage.clickCheckboxMessage();
	}
	@When("^I click button delete$")
	public void deleteButton() {

		delMessage.clickDelMessageButton();
	}
	
	@Then("I see message Mail successfully deleted")
	public void seeMessage() {
		Assert.assertTrue(delMessage.MessagePresents());
	}
	
	@After 
	public void afterClass() {
		webDriver.quit();
	}

}
