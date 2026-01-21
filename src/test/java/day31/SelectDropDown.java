package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpcountryEle = driver.findElement(By.xpath("//select[@id='country']"));
		Select drpCountry = new Select(drpcountryEle);
		
		// Select Options from the dropdown
		
		// selectByVisibleText
		//drpCountry.selectByVisibleText("France");
		
		//selectByValue
		//drpCountry.selectByValue("uk");
		
		// selectByIndex -- if the index not given you need to count it manually starting from zero
		drpCountry.selectByIndex(3);
		
		// Get the options counting them and printing them into the console
		List <WebElement> options = drpCountry.getOptions();
		System.out.println("Total Number of options are: " + options.size());
		
		for(WebElement op:options) {
			System.out.println(op.getText());
		}
	}

}
