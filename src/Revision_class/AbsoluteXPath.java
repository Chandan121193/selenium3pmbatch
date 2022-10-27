package Revision_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXPath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///G:/DEmo%20class/Demositeforcss.html");
		driver.findElement(By.xpath("./html/body/div[1]/input[1]")).clear();
		driver.findElement(By.xpath("./html/body/div[1]/input[1]")).sendKeys("Qspiders");
		
	}

}
