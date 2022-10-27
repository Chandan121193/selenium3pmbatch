package TakesScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenOfWebpage {
	public static void main(String[] args) throws InterruptedException, IOException {
		Date date = new Date();
		String sysdate = date.toString().replace(" ", "_").replace(":", "_");
		System.out.println(sysdate);
	    
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		
		 TakesScreenshot ts = (TakesScreenshot)driver;
		  File source = ts.getScreenshotAs(OutputType.FILE);
		    File destination = new File("./screenshot/errorshot1"+sysdate+".png");
		    Files.copy(source, destination);
		   }
}
