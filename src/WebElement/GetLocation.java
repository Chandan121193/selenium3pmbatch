package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///G:/HTML/DemoPageFor3PMbACK.html");
		
		 Point loc = driver.findElement(By.xpath("//input[@type=\"text\"][1]")).getLocation();
		System.out.println(loc);
		
		 int startX = loc.getX();
		 int startY = loc.getY();
		 System.out.println("The StartX is : "+startX);
		 System.out.println("The StartY is : "+startY);
		
	}

}
