package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import page.LoginPage;
import page.UncheckAllMessages;

public class UncheckAllMessagesTest {
	private static final String CHROMEDRIVER = "D:\\selenium\\chromedriver.exe";
	private static final String MAIN_URL = "http://mail.ru";
	private static final String PASSWORD = "dasha2912900";
	private static final String LOGIN = "dashamihai";
	private WebDriver driver;
	private LoginPage loginPage;
	private UncheckAllMessages noFlagMessage;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", CHROMEDRIVER);
		driver = new ChromeDriver();
		driver.get(MAIN_URL);
		loginPage = new LoginPage(driver);
		noFlagMessage = new UncheckAllMessages(driver);

	}

	@Test
	public void FlagMessage() {
		loginPage.enterLoginAndPass(LOGIN, PASSWORD);
		loginPage.clickEnterButton();
		noFlagMessage.clickFlagButton();
		noFlagMessage.CheckboxAllMessages();
		noFlagMessage.ClickmoreButton();
		noFlagMessage.ClickUncheckFlagButton();
		AssertJUnit.assertTrue(noFlagMessage.EmtyMessageLinkPresents());
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
