package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Baseclass;
import pages.AddtoCart;
import pages.HomePage;
import pages.LoginPage;

public class Addingproducttocart extends Baseclass{
	@Test
	public void addingtocart() throws FileNotFoundException, IOException {
		LoginPage l=new LoginPage(driver);
		l.signinButton();
		l.serachtextbox(p.getData("productname"));
		l.serchButton();
		
		HomePage h=new HomePage(driver);
		u.dropDown(h.getSortdd(),p.getData("sortdd"));
		h.selecteddress();
		
		AddtoCart a=new AddtoCart(driver);
		a.plusbuttton();
		u.dropDown(a.getSizedd(),p.getData("sizedd"));
		a.buecolor();
		a.addtocartbt();
		a.proceedTocheckoutbtn();
		
		Assert.assertEquals(driver.getTitle(),p.getData("Processtocheckout"));
		
	}

}
