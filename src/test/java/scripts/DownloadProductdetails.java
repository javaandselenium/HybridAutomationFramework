package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.Baseclass;
import pages.AddtoCart;
import pages.Download;
import pages.LoginPage;
import pages.Myshop;
import pages.Mystore;

public class DownloadProductdetails extends Baseclass{
@Test
public void downloaddetails() throws FileNotFoundException, IOException, InterruptedException {
	LoginPage l=new LoginPage(driver);
	l.signinButton();
	l.enterEmail(p.getData("email"));
	
	Mystore m=new Mystore(driver);
	//u.mouseHover(driver,m.getCart());
	//m.closethedress();
	WebElement loc = m.getCoats();
	Point l1 = loc.getLocation();
	int x = l1.getX();
	int y = l1.getY();
	u.scrollBar(driver,x,y);
	m.coatsandjackets();

	
	Myshop s=new Myshop(driver);
	Thread.sleep(5000);
	s.ireuse();
	Thread.sleep(5000);
	s.creatMyestore();
	
	Download d=new Download(driver);
	u.dropDown(d.getProfiledd(),p.getData("partner"));
	d.downloaddetails(p.getData("emailaddress"));

	Assert.assertEquals(driver.getTitle(),"downloadpage");
	
	
	
}
	
}
