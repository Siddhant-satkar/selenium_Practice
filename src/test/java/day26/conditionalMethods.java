package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en");
		driver.manage().window().maximize();
		
		//isDisplayed

		boolean logo = driver.findElement(By.xpath("//img[@title='nopCommerce']")).isDisplayed();
		System.out.println(logo);
		
		//isEnabled
		//isSelected
		
		//Browser methods
		
	}

}
