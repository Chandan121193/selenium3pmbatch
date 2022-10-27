package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePromptPopUp {
	public static void main(String[] args) throws InterruptedException {
	     System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		 
		Thread.sleep(5000);
		 WebElement element = driver.findElement(By.xpath("//div[text()='Alerts']"));
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("arguments[0].scrollIntoView(true)", element);
		    Thread.sleep(5000);
		    driver.findElement(By.id("promtButton")).click();
		    
		     Alert alert = driver.switchTo().alert();
		     Thread.sleep(5000);
		     alert.sendKeys("chandan");
		     Thread.sleep(5000);
		     
		     alert.accept();
		    
	}

}
