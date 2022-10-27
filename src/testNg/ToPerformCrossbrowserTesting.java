package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ToPerformCrossbrowserTesting {
	WebDriver driver;
	@Test
	public void demo(String browser) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/chromedriver.exe");
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("");
		
	}

}
