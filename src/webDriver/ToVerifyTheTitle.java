package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToVerifyTheTitle {
	public static void main(String[] args) {
		String expectedTitle = "Instagram";
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Pass: The Title is Verified");
		}
		else
			System.out.println("Fail: The Title not is Verified");
	}

}
