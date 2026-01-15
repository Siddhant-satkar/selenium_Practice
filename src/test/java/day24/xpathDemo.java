package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowallSelection")).click();
		
		//Xpath with single attribute
		driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']")).sendKeys("Tshirt@gmail.com");
		
		//xpath with multiple attributes
		driver.findElement(By.xpath("//form[@id='Form_submitForm']//input[@id='Form_submitForm_action_request']")).click();
	}

}
