package scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void testA() throws MalformedURLException {
		URL remoteAddress=new URL("http://192.168.0.103:4444/wd/hub");

		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		
		
	 RemoteWebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("books");
}
}