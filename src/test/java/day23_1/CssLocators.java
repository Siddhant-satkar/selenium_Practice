package day23_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {
	
	public static void main(String args []) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://automationpanda.com/");
		
		driver.manage().window().maximize();
		
		
		//Tag Id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Iphone 17 Pro max");
		
		//Tag Class
		driver.findElement(By.cssSelector("input.search-field")).sendKeys("python");
	}

}
