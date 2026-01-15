package day26;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("java Test");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
	}

}
