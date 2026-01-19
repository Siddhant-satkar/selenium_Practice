package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Select specific check box
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		// Select all the check boxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		for(WebElement checkbox: checkboxes) {
			checkbox.click();
		}
		
		// Select last 3 check boxes
		// Formula :- Total Number of checkboxes - How many check boxes want to select = Starting index i.e. 7-3=4
		
		for (int i=4; i<=checkboxes.size();i++) {
			checkboxes.get(i).click();
		}
		
		// Select first 3 check boxes
		
		for(int i=0; i<3; i++) {
			checkboxes.get(i).click();
		}
		
		// Unselect check boxes if they are selected 
		
		for(int i=0; i<3; i++) {
			checkboxes.get(i).click();
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i=0; i<=checkboxes.size();i++) {
			if(checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
			}
		}
		
	}

}
