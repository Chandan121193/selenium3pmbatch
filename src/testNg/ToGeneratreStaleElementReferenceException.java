package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGeneratreStaleElementReferenceException {
	public void demo() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	
	  WebElement ele = driver.findElement(By.id("username"));
	  System.out.println(ele);
	  ele.sendKeys("admin");
	  
	  driver.navigate().refresh();
	  System.out.println(ele);
	  ele.sendKeys("manager");
	}
}
