package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myshop {
	@FindBy(xpath="//a[contains(text(),'Create my store')]          ")
    private WebElement createstore;
	
	@FindBy(xpath="//button[text()='I refuse']")
	private WebElement refuse;
	
	public Myshop(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void ireuse() {
		refuse.click();
	}
	public void creatMyestore() {
		createstore.click();
	}
	
}
