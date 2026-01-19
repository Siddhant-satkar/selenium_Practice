package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		
		// [1] Normal alert with OK button
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// clicking ok on the normal ok button
		//driver.switchTo().alert().accept();
		
		// Capturing the alert text 
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		
		// [2] Confirmation Alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']']")).click();
		driver.switchTo().alert().accept(); // Close alert using ok button
		driver.switchTo().alert().dismiss(); // close alert using cancel button 
		
		// [3] Prompt Alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert myalert1 = driver.switchTo().alert();
		myalert1.sendKeys("Welcome"); 
		myalert1.accept();
	}

}
