package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformActionOnDuplicateAttribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///G:/DEmo%20class/Demositeforcss.html");
		driver.findElement(By.cssSelector("input#abc")).sendKeys("Qspiders");
		driver.findElement(By.cssSelector("input.def")).sendKeys("Jspiders");
		
	}

}
