package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyToolTipText {
	public static void main(String[] args) {
		 String expectedToolTipText = "Do not selet if this computer is shared";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		 String actualToolTipText = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
		 System.out.println(actualToolTipText);
		 
		 
		if(actualToolTipText.equals(expectedToolTipText)) {
			System.out.println("Pass: The Tool Tip text has been verified");
			 
		 }
		else
			System.out.println("Fail: The Tool Tip text has not been verified");
		
		driver.quit();
		
		
	}

}
