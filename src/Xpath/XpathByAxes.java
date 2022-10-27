package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {
	public static void main(String[] args) {
		String productName = "JBL Flip 6 Wireless Portable Bluetooth Speaker with JBL Pro Sound, Upto 12 Hours Playtime, IP67 Water & Dustproof, PartyBoost & Personalization by JBL App (Without Mic, Black)";
		String price = "₹11,999";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/JBL-Bluetooth-Dustproof-PartyBoost-Personalization/dp/B09V7WS4PP/ref=sr_1_13?keywords=jbl+speaker&qid=1662543474&sr=8-13");
		
		
		
		String text = driver.findElement(By.xpath("//span[contains(text(), '"+productName+"')]/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[text()='"+price+"']")).getText();
		System.out.println(text);
	}

}
