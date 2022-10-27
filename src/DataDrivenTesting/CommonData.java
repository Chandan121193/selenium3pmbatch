package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonData {
	public static void main(String[] args) throws IOException {
		
		
		  FileInputStream fis = new FileInputStream("./PropertyDataSept/first.properties");
		  Properties property = new Properties();
		  property.load(fis);  
		  
		  String url = property.getProperty("url");
		  String username = property.getProperty("username");
		  String password = property.getProperty("password");
		  
	      System.out.println(url);
	      System.out.println(username);
	      System.out.println(password);
		  
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		
		driver.findElement(By.id("username")).sendKeys(username);
		  WebElement passTxtFld = driver.findElement(By.name("pwd"));
		  passTxtFld.sendKeys(password);
		  passTxtFld.sendKeys(Keys.ENTER);
		  
		}

}
