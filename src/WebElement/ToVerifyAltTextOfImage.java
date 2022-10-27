package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToVerifyAltTextOfImage {

	public static void main(String[] args) throws InterruptedException  {
		String expectedAltTextImage = "Flipkart";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Actions action=new Actions(driver);
		action.moveByOffset(1300, 50).click().perform();
		String actualAltTextImage = driver.findElement(By.xpath("//img[@src='//static-assets-web.flixcart.com/fk-p-linchpin-web/fk-cp-zion/img/flipkart-plus_8d85f4.png']")).getAttribute("alt");
		Thread.sleep(5000);		
		if(actualAltTextImage.contains(expectedAltTextImage)) {
			System.out.println("Pass: The Alt Text is verified");
			}
		else
			System.out.println("Fail: The Alt Text not verified");
		driver.quit();
}
}
