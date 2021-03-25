package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Baseclass;
import pages.Eveningdress;
import pages.LoginPage;

public class Deliveryproduct extends Baseclass{
	@Test
	public void delivery() throws InterruptedException, FileNotFoundException, IOException {
		LoginPage l=new LoginPage(driver);
		l.signinButton();
		u.mouseHover(driver,l.getDressesbtn());
		l.eveingdresstab();
		
		Eveningdress e=new Eveningdress(driver);
		e.sizecheckbox();
		e.colorcheckbox();
		e.quantitycheckbox();
		u.slider(driver,e.getSliders());
		e.deliveryBtn();
		
		Assert.assertEquals(driver.getTitle(),p.getData("deliverypage"));
		
	}

}
