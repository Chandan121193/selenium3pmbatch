package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyWhetherSelectedOrNot {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement element = driver.findElement(By.id("keepLoggedInCheckBox"));
		element.click();
		boolean selected = element.isSelected();
		if(selected)  {
			System.out.println("Pass: The element is selected");
			
		}
		else
			System.out.println("Fail: The element is not selected");
		
	}

}
