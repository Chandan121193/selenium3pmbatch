package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.google.com/");
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
		
		driver.navigate().to("https://www.facebook.com/");
		String windowID2 = driver.getWindowHandle();
		System.out.println(windowID2);
		
	}

}
