package PopUps;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleChildBrowserPopUp {
	public static void main(String[] args) throws InterruptedException {
	     System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		    String parentId = driver.getWindowHandle();
		
		   driver.findElement(By.xpath("actiTIME Inc.")).click();
		   Thread.sleep(2000);
		   Set<String> allwindowIds = driver.getWindowHandles();
		   
		   for(String id : allwindowIds) {
			   
			   driver.switchTo().window(id);
			   if(!id.equals(parentId)) {
				   driver.findElement(By.linkText("Try Free")).click();
				   break;
				   }
			   }
		   
		   driver.switchTo().window(parentId);
		   driver.findElement(By.id("KeepLoggedInCheckBox")).click();
		   
		   
				   
		
	}
	

}
