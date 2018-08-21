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

public class MessageSendTest {

	private WebDriver driver;
	private LoginPage loginPage;
	private MessageSend messageSend;

	@BeforeClass
	public void beforeClass() {
		String exePath = "D:\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.get("http://mail.ru");
		loginPage = new LoginPage(driver);
		messageSend = new MessageSend(driver);

	}

	@Test
	public void sendMessage() {
		loginPage.enterLoginAndPass("dashamihai", "dasha2912900");
		loginPage.clickEnterButton();
		messageSend.clickWriteMessage();
		AssertJUnit.assertTrue(messageSend.RecipientPresents());
		messageSend.enterRecipient("daruha2008@yandex.ru");
		driver.switchTo().frame(driver.findElement(By.xpath(".//tr[@class='mceFirst mceLast']//iframe")));
		messageSend.enterTextMessage("text");
		driver.switchTo().defaultContent();
		messageSend.clickSendMessage();
		AssertJUnit.assertTrue(messageSend.sendMessagePresents());
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
