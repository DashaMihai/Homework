package junitcucumber;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class BasketSteps {
	private static final String MAIN_URL = "http://mail.ru";
	private static final String CHROMEDRIVER_EXE = "D:\\selenium\\chromedriver.exe";
	private static final String LOGIN = "dashamihai";
	private static final String PASSWORD = "dasha2912900";
	private BasketPage basketPage;
	private WebDriver webDriver;

	public BasketSteps() {
		String exePath = CHROMEDRIVER_EXE;
		System.setProperty("webdriver.chrome.driver", exePath);
		webDriver = new ChromeDriver();
		basketPage = new BasketPage(webDriver);
	}

	@Given("^I am on main application page1$")
	public void loadMainPage() {
		webDriver.get(MAIN_URL);
	}

	@When("^I login as correct user1$")
	public void loginAsCorrectUser() {
		basketPage.enterLoginAndPass(LOGIN, PASSWORD);
		basketPage.clickEnterButton();
	}

	@When("^I click basket$")
	public void openBasketPage() {

		basketPage.clickBasketButton();
	}
	@When("^I click to clear the folder$")
	public void cleanBasket() {

		basketPage.clickCleanFolderButton();
	}
	@When("^I click yes button$")
	public void cleanAllBasket() {

		basketPage.clickYESButton();;
	}
	

//	@Then("I see logout link1")
//	public void seeLogoutLink() {
//		Assert.assertTrue(basketPage.logoutLinkPresents());
//	}

	@Then("I see empty page")
	public void seeBasketPage() {
		Assert.assertTrue(basketPage.EmptyBasketLinkPresents());
	}
	
	@After 
	public void afterClass() {
		webDriver.quit();
	}

}
