package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import page.CleanBasket;
import page.DelMessage;
import page.LoginPage;
import page.MessageSend;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;

public class DelMessageTest {
	private WebDriver driver;
	private LoginPage loginPage;
	private DelMessage delMessage;

	@BeforeClass
	public void beforeClass() {
		String exePath = "D:\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.get("http://mail.ru");
		loginPage = new LoginPage(driver);
		delMessage = new DelMessage(driver);

	}

	@Test
	public void delMessage() {
		loginPage.enterLoginAndPass("dashamihai", "dasha2912900");
		loginPage.clickEnterButton();
		delMessage.clickCheckboxMessage();		
		delMessage.clickDelMessageButton();
	 AssertJUnit.assertTrue(delMessage.MessagePresents());
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
