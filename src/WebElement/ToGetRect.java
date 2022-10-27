package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetRect {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///G:/HTML/DemoPageFor3PMbACK.html");
		
		Rectangle rect = driver.findElement(By.xpath("//input[@type=\"text\"][1]")).getRect();
		 int endX = rect.getX()+rect.getWidth();
		 System.out.println("The EndX is :"+endX);
		 driver.quit();
		
		
		
		
		
	}

}
