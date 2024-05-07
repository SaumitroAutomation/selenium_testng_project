package demo.testautomation.pratciceTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class saucedemo_practiceTest {
	
	boolean statusFlag=false;

	@Test
	public void remoteLoginTest() {
		try {
			
			
			URL gridUrl = new URL("http://localhost:4444/wd/hub");

			ChromeOptions option = new ChromeOptions();

			RemoteWebDriver rwd = new RemoteWebDriver(gridUrl, option);
			
			rwd.get("https://www.saucedemo.com/");
			
			System.out.println("Title of the web Application :"+ rwd.getTitle());
			
			String applicationTitle=rwd.getTitle();
			
			if(applicationTitle.equalsIgnoreCase("Swag Labs")) {
				statusFlag=true;
				
				assertTrue(statusFlag);
				System.out.println("Title fetched");
				
			}
			else {
				statusFlag=false;
				assertTrue(statusFlag);
				System.out.println("Title not fetched");
				
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Title not fetched");
			statusFlag=false;
			assertTrue(statusFlag);
		}
	}

}
