package test_moving_from_login_page;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Additional_Scenario_Registration_with_credits_of_existing_user {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/home/dmbiel/Staging_Tests/geckodriver"); 
		//adding WebDriver
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://staging.uptowork.workz.it/login"); 
		// entering testing page
		
		driver.findElement(By.linkText("Sign Up")).click(); 
		//press "Sign Up" button
		
		Thread.sleep(500); 
		//time-out in test for operation on page
		
        driver.findElement(By.name("email")).sendKeys("Dmbiel.test@gmail.com"); 
        //finding form and sending e-mail to form
		
		driver.findElement(By.name("password")).sendKeys("Dima1234"); 
		//finding form and sending password to form
		
		Thread.sleep(500); 
		//time-out in test for operation on page
		
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(5000); 
		//time-out in test for operation on page
				
		if (driver.getTitle().equals("User's panel | Uptowork"))  //get test results
		{
		JOptionPane.showMessageDialog(null,"Test Registering Using Credits of Existing User is Pass");
		}
		else 
		{
		JOptionPane.showMessageDialog(null,"Test Registering Using Credits of Existing User isn't Pass");
		}
				
		driver.quit(); 
		//close WebDriver

	}

}
