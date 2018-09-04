package test;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import Singletone.SingletonWebdriver;
import facade.CheckboxMessage;
import facade.MessageNotSpam;
import facade.SpamBasket;
import facade.SpamInterface;
import org.testng.annotations.BeforeClass;
import page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MessageOutSpamTest {

	private static final String MAIN_URL = "http://mail.ru";
	private static final String PASSWORD = "dasha2912900";
	private static final String LOGIN = "dashamihai";
	private WebDriver driver;
	private LoginPage loginPage;
	private SpamInterface spamOutMessage;
	private SpamInterface spam;
	private MessageNotSpam messageNotSpam;
	private SpamBasket spamBasket;
	private CheckboxMessage checkbox;

	@BeforeClass
	public void beforeClass() {
		driver = SingletonWebdriver.getWebdriver();
		driver.get(MAIN_URL);
		loginPage = new LoginPage(driver);
		spam = new SpamInterface(driver);
//		messageNotSpam = new MessageNotSpam(driver);
//		spamBasket = new SpamBasket(driver);
//		checkbox = new CheckboxMessage(driver);

	}

	@Test
	public void MessageOutSpam() {
		spamOutMessage = new SpamInterface(spamBasket, checkbox, messageNotSpam);
		loginPage.enterLoginAndPass(LOGIN, PASSWORD);
		loginPage.clickEnterButton();
		spamOutMessage.activate();

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
