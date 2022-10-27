package Revision_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentAndDependentXPath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		Thread.sleep(2000);
		 String text = driver.findElement(By.xpath("//div[.='APPLE iPhone 14 Pro (Gold, 256 GB)']/../..//div[text()='₹1,39,900']")).getText();
		 System.out.println(text);
		
	}

}
