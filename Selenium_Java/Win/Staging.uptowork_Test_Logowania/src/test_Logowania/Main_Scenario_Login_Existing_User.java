package test_Logowania;

import javax.swing.JOptionPane;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main_Scenario_Login_Existing_User {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Eclipse\\selenium-java-3.9.1\\geckodriver\\geckodriver.exe");
			
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://staging.uptowork.workz.it/login");
		
		Thread.sleep(5);
		
		driver.findElement(By.name("email")).sendKeys("Dmbiel.test@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Dima1234");
		
		Thread.sleep(500);
		
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(5000);
				
		if (driver.getTitle().equals("User's panel | Uptowork")) 
		{
		JOptionPane.showMessageDialog(null,"Test Login Existing User is Pass");
		}
		else 
		{
		JOptionPane.showMessageDialog(null,"Test Login Existing User isn't Pass");
		}
				
		driver.quit();

	}

}
