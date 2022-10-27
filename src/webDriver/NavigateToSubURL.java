package webDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToSubURL {
	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		URL url=new URL("https://www.facebook.com/?_rdc=1&_rdr");
		driver.navigate().to(url);
		driver.quit();
		
		
		
		
	}

}
