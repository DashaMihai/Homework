package junitcucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MailSendGroupsSteps {
	private static final String MAIN_URL = "http://mail.ru";
	private static final String CHROMEDRIVER_EXE = "D:\\selenium\\chromedriver.exe";
	private static final String LOGIN = "dashamihai";
	private static final String PASSWORD = "dasha2912900";
	private MailSendGroups sendMessage;
	private LoginPage login;
	private WebDriver webDriver;

	public MailSendGroupsSteps() {
		String exePath = CHROMEDRIVER_EXE;
		System.setProperty("webdriver.chrome.driver", exePath);
		webDriver = new ChromeDriver();
		sendMessage = new MailSendGroups(webDriver);
		login = new LoginPage(webDriver);
	}

	@Given("^I am on main application page 2$")
	public void loadMainPage() {
		webDriver.get(MAIN_URL);
	}

	@When("^I login as correct user 2$")
	public void loginAsCorrectUser() {
		login.enterLoginAndPass(LOGIN, PASSWORD);
		login.clickEnterButton();
	}

	@When("^I click button write a letter$")
	public void openWriteMessagePage() {

		sendMessage.clickWriteMessage();
	}
	@When("^I enter recipient addresses$")
	public void recipients() {

		sendMessage.enterRecipient("daruha2008@yandex.ru, migay@autospace.by");
	}
	@When("^I enter the text of the letter$")
	public void textMessage() {
		webDriver.switchTo().frame(webDriver.findElement(By.xpath(".//tr[@class='mceFirst mceLast']//iframe")));
		sendMessage.enterTextMessage("text");
		webDriver.switchTo().defaultContent();
			}
	@When("^I click send button$")
	public void sendMessage() {

		sendMessage.clickSendMessage();
	}

	@Then("I see message mail successfully sent")
	public void seeBasketPage() {
		Assert.assertTrue(sendMessage.sendMessagePresents());
	}
	
	@After 
	public void afterClass() {
		webDriver.quit();
	}

}
