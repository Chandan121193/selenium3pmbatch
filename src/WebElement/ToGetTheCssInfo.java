package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheCssInfo {
	public static void main(String[] args) {
		 String expectedToolTipText = "Do not selet if this computer is shared";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String color = driver.findElement(By.xpath("//div[text()='Login ']")).getCssValue("border-top-color");
		System.out.println(color);
		
	}

}
