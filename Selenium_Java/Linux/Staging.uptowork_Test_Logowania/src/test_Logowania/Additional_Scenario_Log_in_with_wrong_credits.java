package test_Logowania;

import javax.swing.JOptionPane;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Additional_Scenario_Log_in_with_wrong_credits {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/home/dmbiel/Staging_Tests/geckodriver"); 
		//adding WebDriver
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://staging.uptowork.workz.it/login"); 
		// entering testing page
		
		Thread.sleep(5); 
		//time-out in test for operation on page
		
		driver.findElement(By.name("email")).sendKeys("Dmbiel.test@gmail.com"); 
		//finding form and sending e-mail to form
		
		driver.findElement(By.name("password")).sendKeys("Dimu1234"); 
		//finding form and sending password to form
		
		Thread.sleep(500); 
		//time-out in test for operation on page
		
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(500); 
		//time-out in test for operation on page
		
		String tagName = driver.findElement(By.className("modal-close")).getTagName(); 
		//get test results
		
		if (tagName.equals("a")) 
		{
		JOptionPane.showMessageDialog(null,"Test Login Existing User with Wrong Credentials is Pass");
		}
		else 
		{
		JOptionPane.showMessageDialog(null,"Test Login Existing User with Wrong Credentials isn't Pass");
		}
				
		driver.quit(); 
		//close WebDriver

	}

}
