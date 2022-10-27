package basic_Text_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import POMClasses.CustomerDetailsPage;
import POMClasses.HomePage;
import POMClasses.LoginPage;

public class ToVerifyHomePage {
	@Test
	public void toVerifyHomepage() {
		String expectedHomePageTitle ="actiTIME - Enter Time-Track";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage login = new LoginPage(driver);
		login.loginAction("admin", "manager");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("Enter"));
		
		
		String actualHomePageTitle = driver.getTitle();
		
		Assert.assertEquals(actualHomePageTitle, expectedHomePageTitle);
		System.out.println("Pass:The customer Name has been verified");
		
	
	}

}
