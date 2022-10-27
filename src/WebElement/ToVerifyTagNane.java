package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTagNane {
	public static void main(String[] args) {
		 String expectedToolTipText = "Do not selet if this computer is shared";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		 WebElement usernameElement = driver.findElement(By.id("username"));
		 String usernameTagName = usernameElement.getTagName();
		 if(usernameTagName.equals("input"))  {
			 usernameElement.sendKeys("admin");
		 }
		 
		   WebElement passwordElement = driver.findElement(By.name("pwd"));
		 
		
		
	}

}
