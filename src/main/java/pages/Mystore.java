package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mystore {
	@FindBy(xpath="//a[@title='View my shopping cart']")
    private WebElement cart;

	public WebElement getCart() {
		return cart;
	}
	
	@FindBy(xpath="//a[@title='remove this product from my cart']")
	private WebElement close;
	
	@FindBy(xpath="(//img[@class='item-img'])[5]")
	private WebElement coats;
	
	public Mystore(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void closethedress() {
		close.click();
	}
	
	public void coatsandjackets() {
		coats.click();
	}

	public WebElement getCoats() {
		return coats;
	}
	
	
}
