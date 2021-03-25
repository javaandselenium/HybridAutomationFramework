package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	private WebElement signinBtn;
	
	@FindBy(id="search_query_top")
	private WebElement serachtb;
	
	@FindBy(name="submit_search")
	private WebElement goButton;
	
	@FindBy(xpath="(//a[text()='Dresses'])[2]")
	private WebElement dressesbtn;
	
	public WebElement getDressesbtn() {
		return dressesbtn;
	}
	
	@FindBy(xpath="(//a[text()='Evening Dresses'])[2]")
	private WebElement eveningdress;
	
	@FindBy(id="newsletter-input")
	private WebElement newslettertb;
	
	@FindBy(name="submitNewsletter")
	private WebElement gobtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void signinButton() {
		signinBtn.click();
	}
	
	public void serachtextbox(String product) {
		serachtb.sendKeys(product);
	}
	
	public void serchButton() {
		goButton.click();
	}
	
	public void eveingdresstab() {
		eveningdress.click();
	}
	
	public void enterEmail(String mail) {
		newslettertb.sendKeys(mail);
		gobtn.click();
	}
	
}
