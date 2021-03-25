package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Download {
	@FindBy(id="edit-submitted-type")
	private WebElement profiledd;

	public WebElement getProfiledd() {
		return profiledd;
	}
	
	@FindBy(id="edit-submitted-email")
	private WebElement email;
	
	@FindBy(xpath="//label[text()='I agree to the ']")
	private WebElement iagree1;
	
	@FindBy(xpath="(//label[text()='I agree to the '])[2]")
	private WebElement iagree2;
	
	@FindBy(name="op")
	private WebElement download;
	
	public Download(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void downloaddetails(String emailaddress) throws InterruptedException {
		email.sendKeys(emailaddress);
		Thread.sleep(2000);
		iagree1.click();
		Thread.sleep(2000);
		iagree2.click();
		Thread.sleep(2000);
		download.click();
	}

}
