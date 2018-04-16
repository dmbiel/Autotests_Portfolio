package test_moving_from_login_page;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main_Scenario_Reset_Password_Coming_Back {

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
		
		driver.findElement(By.linkText("Log In Now")).click(); 
		//press "Log In Now" button
		
		Thread.sleep(5000); 
		//time-out in test for operation on page
						
		if (driver.getTitle().equals("Log In | Uptowork"))  //get test results
		{
		JOptionPane.showMessageDialog(null,"Test Cancel Reset Password is Pass");
		}
		else 
		{
		JOptionPane.showMessageDialog(null,"Test Cancel Reset Password isn't Pass");
		}
				
		driver.quit(); 
		//close WebDriver

	}

}
