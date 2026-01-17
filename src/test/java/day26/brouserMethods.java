package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class brouserMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		try {
		    Thread.sleep(5000);
		} catch (InterruptedException e) {
		    e.printStackTrace(); 
		}
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		try {
		    Thread.sleep(5000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		//driver.close();
		driver.quit();
	}

}
