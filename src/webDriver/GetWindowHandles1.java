package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		
		String parentWindowId = driver.getWindowHandle();
        driver.findElement(By.linkText("actiTIME Inc.")).click();
        Set<String> allwindowIDs = driver.getWindowHandles();
        for(String id:allwindowIDs) {
        	driver.switchTo().window(id);
        	if(!id.equals(parentWindowId)) {
        		driver.close();
        		break;
        	}
        }
        driver.switchTo().window(parentWindowId);
        driver.findElement(By.id("keepLoggedInCheckBox")).click();
		
	}

}
