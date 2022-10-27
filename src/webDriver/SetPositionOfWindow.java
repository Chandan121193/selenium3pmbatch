package webDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionOfWindow {
	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Point position = new Point(1000, 1000);
		 driver.manage().window().setPosition(position);
		Thread.sleep(2000);
		
		Point position1 = new Point(-100, -50);
		driver.manage().window().setPosition (position1);
		
	}

}
