package test_Logowania;

import javax.swing.JOptionPane;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Additional_Scenario_Log_in_with_any_empty_credits {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/home/dmbiel/Staging_Tests/geckodriver"); 
		//adding WebDriver

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://staging.uptowork.workz.it/login"); 
		// entering testing page
		
		Thread.sleep(5); 
		//time-out in test for operation on page
			
		driver.findElement(By.name("submit")).click(); 
		//submit the form
		
		Thread.sleep(500); 
		//time-out in test for operation on page
		
		String alert = driver.findElement(By.className("form__error")).getAttribute("data-message"); 
		//get test results
			
		if (alert.equals("Wrong password") || alert.equals("Wrong e-mail address")) 
		{
		JOptionPane.showMessageDialog(null,"Test Login Existing User with Empty Email is Pass");
		}
		else 
		{
		JOptionPane.showMessageDialog(null,"Test Login Existing User with Empty Email isn't Pass");
		}
				
		driver.quit(); 
		//close WebDriver

	}

}
