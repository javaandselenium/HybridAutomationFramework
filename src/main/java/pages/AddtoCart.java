package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart {
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement plusbtn;
	
	@FindBy(id="group_1")
	private WebElement sizedd;
	
	@FindBy(name="Blue")
	private WebElement color;
	
	@FindBy(xpath="//span[text()='Add to cart']")
    private WebElement addtocart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceedtocheckout;
	
	public AddtoCart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void plusbuttton() {
		plusbtn.click();
	}

	public WebElement getSizedd() {
		return sizedd;
	}
	
	public void buecolor() {
		color.click();
	}
	
	public void addtocartbt() {
		addtocart.click();
	}
	
	public void proceedTocheckoutbtn() {
		proceedtocheckout.click();
	}
}
