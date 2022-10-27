package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToValidateURL {
	public static void main(String[] args) {
		String expectedURL = "instagram";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/?hl=en");
		
		String actualURL=driver.getCurrentUrl();
		System.out.println(actualURL);
		if(actualURL.contains(expectedURL)) {
			System.out.println("pass:The URL is verified");
		}
		else
			
			System.out.println("Fail: The URL is not verived");
		
		
	}

}
