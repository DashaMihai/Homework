package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.LoginPage;
import page.MessageSendGroup;


public class MessageSendGroupTest {
	private WebDriver driver;
	private LoginPage loginPage;
	private MessageSendGroup messageSendGroup;

	@BeforeClass
	public void beforeClass() {
		String exePath = "D:\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.get("http://mail.ru");
		loginPage = new LoginPage(driver);
		messageSendGroup = new MessageSendGroup(driver);

	}

	@Test
	public void sendMessage() {
		loginPage.enterLoginAndPass("dashamihai", "dasha2912900");
		loginPage.clickEnterButton();
		messageSendGroup.clickWriteMessage();
		AssertJUnit.assertTrue(messageSendGroup.RecipientPresents());
		messageSendGroup.enterRecipient("daruha2008@yandex.ru, migay@autospace.by");
		driver.switchTo().frame(driver.findElement(By.xpath(".//tr[@class='mceFirst mceLast']//iframe")));
		messageSendGroup.enterTextMessage("text");
		driver.switchTo().defaultContent();
		messageSendGroup.clickSendMessage();
		AssertJUnit.assertTrue(messageSendGroup.sendMessagePresents());
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
