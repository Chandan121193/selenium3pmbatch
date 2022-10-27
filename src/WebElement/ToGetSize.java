package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSize {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///G:/HTML/DemoPageFor3PMbACK.html");
		 Dimension dim = driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).getSize();
		System.out.println(dim);
		int width = dim.getWidth();
		int height = dim.getHeight();
		System.out.println("The Height of Username textfield is : "+height);
		System.out.println("The width of Username textfield is : "+width);
		
		
	}

}
