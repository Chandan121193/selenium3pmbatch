package WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheDimension {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///G:/HTML/DemoPageFor3PMbACK.html");
		
		 Dimension  UsernameTextFieldDim = driver.findElement(By.xpath("//input[@type=\"text\"][1]")).getSize();
		 Dimension  passwordTextFieldDim = driver.findElement(By.xpath("//input[@type=\"text\"][2]")).getSize();
		 
		int usernameTextFieldHeight = UsernameTextFieldDim.getHeight();
		int usernameTextFieldwidth = UsernameTextFieldDim.getWidth();
		
		int passwordTextFieldHeight = passwordTextFieldDim.getHeight();
		int passwordTextFieldwidth = passwordTextFieldDim.getWidth();
		
		if(usernameTextFieldHeight == passwordTextFieldHeight && usernameTextFieldwidth == passwordTextFieldwidth) {
			System.out.println("Pass: The Dimension of the username and password text fields are verified");
		}
		else
			System.out.println("Fail: The Dimension of the username and password text fields are not verified");
		
		
	}

}
