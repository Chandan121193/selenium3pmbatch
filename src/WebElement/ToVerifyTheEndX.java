package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheEndX {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///G:/HTML/DemoPageFor3PMbACK.html");
		
		Rectangle usernameRect = driver.findElement(By.xpath("//input[@type=\"text\"][1]")).getRect();
		 Rectangle passwordRect = driver.findElement(By.xpath("//input[@type=\"text\"][2]")).getRect();
		 
		  
		int usernameEndX = usernameRect.getX()+usernameRect.getWidth();
		int passwordEndX = passwordRect.getX()+passwordRect.getWidth();
		
		if(usernameEndX == passwordEndX) {
			System.out.println("Pass: The End of Username Text fields are allingned are verified");
		}
		else
			System.out.println("Fail: The End of Username Text fields are allingned are not verified");
		
		driver.quit();
		
	}
	
	

}
