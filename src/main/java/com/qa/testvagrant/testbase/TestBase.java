package com.qa.testvagrant.testbase;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
//import com.qa.crm.util.TestUtil;
//import com.qa.crm.util.WebEventListener;

 public class TestBase {
      public static Properties prop;
      public static WebDriver driver;
      public  static EventFiringWebDriver e_driver;
    //public static WebEventListener eventListener;
	
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Selenium Program\\FreeCRMTestFramework\\src\\main\\java\\config\\configuration.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void initialization() {
		
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
			driver = new ChromeDriver();
			}
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
		//driver.get(prop.getProperty("url"));
		driver.get("https://www.freecrm.com/index.html");
	}
	
}