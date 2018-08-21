package test;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.MessageInSpam;

public class MessageInSpamTest {
	private static final String CHROMEDRIVER = "D:\\selenium\\chromedriver.exe";
	private static final String MAIN_URL = "http://mail.ru";
	private static final String PASSWORD = "dasha2912900";
	private static final String LOGIN = "dashamihai";
	private WebDriver driver;
	private LoginPage loginPage;
	private MessageInSpam spamMessage;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", CHROMEDRIVER);
		driver = new ChromeDriver();
		driver.get(MAIN_URL);
		loginPage = new LoginPage(driver);
		spamMessage = new MessageInSpam(driver);

	}

	@Test
	public void MessageInSpam() {
		loginPage.enterLoginAndPass(LOGIN, PASSWORD);
		loginPage.clickEnterButton();
		spamMessage.clickCheckboxMessage1();
		spamMessage.clickSpamButton();
		AssertJUnit.assertTrue(spamMessage.MessageInSpamPresents());
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
