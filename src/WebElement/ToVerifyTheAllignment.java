package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheAllignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///G:/HTML/DemoPageFor3PMbACK.html");
		
		  Point usernameLoc = driver.findElement(By.xpath("//input[@type=\"text\"][1]")).getLocation();
		   Point passwordLoc = driver.findElement(By.xpath("//input[@type=\"text\"][2]")).getLocation();
		   
		    int usernameStartX = usernameLoc.getX();
		    int passwordStartX = passwordLoc.getX();
		    
		    
			if(usernameStartX == passwordStartX) {
				System.out.println("Pass: The StartX of the TextFields are alligned and verified");
		    	}
			else
				System.out.println("Fail: The StartX of the TextFields are not alligned and verified");
				
		
	}

}
