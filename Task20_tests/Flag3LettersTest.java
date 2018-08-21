package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.Flag3Letters;
import page.LoginPage;

public class Flag3LettersTest {
	private static final String CHROMEDRIVER = "D:\\selenium\\chromedriver.exe";
	private static final String MAIN_URL = "http://mail.ru";
	private static final String PASSWORD = "dasha2912900";
	private static final String LOGIN = "dashamihai";
	private WebDriver driver;
	private LoginPage loginPage;
	private Flag3Letters flagMessage;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", CHROMEDRIVER);
		driver = new ChromeDriver();
		driver.get(MAIN_URL);
		loginPage = new LoginPage(driver);
		flagMessage = new Flag3Letters(driver);

	}

	@Test
	public void FlagMessage() {
		loginPage.enterLoginAndPass(LOGIN, PASSWORD);
		loginPage.clickEnterButton();
		flagMessage.clickFlag1();
		flagMessage.clickFlag2();
		flagMessage.clickFlag3();
		flagMessage.clickFlagButton();
		AssertJUnit.assertTrue(flagMessage.flagMessagePresents());
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
