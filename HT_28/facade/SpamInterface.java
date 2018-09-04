package facade;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

public class SpamInterface {
	private SpamBasket spamBasket;
    private CheckboxMessage checkbox;
    private MessageNotSpam messageNotSpam;
    
    private WebDriver driver;
	 
	 public SpamInterface(WebDriver webdriver)
	    {
	        PageFactory.initElements(webdriver, this);
	        this.driver = webdriver;
	    }
    
   
    
    public SpamInterface(SpamBasket spamBasket, CheckboxMessage checkbox, MessageNotSpam messageNotSpam){
        
        this.spamBasket = spamBasket;
        this.checkbox = checkbox;
        this.messageNotSpam=messageNotSpam;
    }	

	public void activate(){
    	
    	spamBasket.clickButtonSpam();
    	checkbox.clickCheckboxMessage();
    	messageNotSpam.clickNotSpamButton();
    	AssertJUnit.assertTrue(messageNotSpam.MessageOutSpamPresents());
    }

}
