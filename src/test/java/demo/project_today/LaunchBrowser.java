package demo.project_today;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {

	@Test
	public  void browserLaunch() {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiva Badran\\eclipse-workspace\\framework\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		
		driver.get("https://www.rameshsoft.com");
		
		
		

	}
	
	
}
