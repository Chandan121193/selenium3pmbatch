package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyLoginErrorMsg {
	public static void main(String[] args) throws InterruptedException {
		String expectedErrorMsg = "Username";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		String actualErrorMsgf = driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']")).getText();
		if(actualErrorMsgf.contains(expectedErrorMsg)) {
			System.out.println("pass the error msg is verified");
			
		}
		else 
			System.out.println("fail the error msg is verified");
			
		
		
	}

}
