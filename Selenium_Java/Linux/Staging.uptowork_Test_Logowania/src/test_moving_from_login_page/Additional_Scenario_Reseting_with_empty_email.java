package test_moving_from_login_page;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Additional_Scenario_Reseting_with_empty_email {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/home/dmbiel/Staging_Tests/geckodriver"); 
		//adding WebDriver
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://staging.uptowork.workz.it/login"); 
		// entering testing page
		
		driver.findElement(By.linkText("Reset password")).click(); 
		//press "Reset password" button
		
		Thread.sleep(500); 
		//time-out in test for operation on page
				
		driver.findElement(By.name("submit")).click(); 
		//submit the form
		
		Thread.sleep(500); 
		//time-out in test for operation on page
		
        String alert = driver.findElement(By.className("form__error")).getAttribute("data-message"); 
        //get test results
		
		if (alert.equals("Value is required and can't be empty")) 
		{
		JOptionPane.showMessageDialog(null,"Test Reset Password with empty email is Pass");
		}
		else 
		{
		JOptionPane.showMessageDialog(null,"Test Reset Password with empty email isn't Pass");
		}
				
		driver.quit(); 
		//close WebDriver

	}

}
