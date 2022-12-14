package JavaScriptExecutor;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalClick {
	public static void main(String[] args) {
	     System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		 WebElement element = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("arguments[0].click()", element);
	     
	    String title = js.executeScript("return document.title").toString();
	    System.out.println(title);
	}
	
	

}
