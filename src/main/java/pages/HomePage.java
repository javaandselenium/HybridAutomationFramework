package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id="selectProductSort")
	private WebElement sortdd;
	
	@FindBy(xpath="(//a[@title='Faded Short Sleeve T-shirts'])[2]")
	private WebElement dress;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getSortdd() {
		return sortdd;
	}
	
	public void selecteddress() {
		dress.click();
	}
	
	
	

}
