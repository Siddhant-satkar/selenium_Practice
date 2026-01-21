package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleHiddenDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		/*
		// Login
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='']")).click();
		*/
	}

}
