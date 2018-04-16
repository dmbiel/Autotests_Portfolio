package test_moving_from_login_page;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Additional_Scenario_Reseting_with_wrong_email {

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
		
		driver.findElement(By.name("email")).sendKeys("sdfsdf");  
		//finding form and sending e-mail to form

		Thread.sleep(5000); 
		//time-out in test for operation on page
		
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(500); 
		//time-out in test for operation on page
		
        String alert = driver.findElement(By.className("form__error")).getAttribute("data-message");  
        //get test results
		
		if (alert.equals("The input is not a valid email address. Use the basic format local-part@hostname")) 
		{
		JOptionPane.showMessageDialog(null,"Test Reset Password with wrong email is Pass");
		}
		else 
		{
		JOptionPane.showMessageDialog(null,"Test Reset Password with wrong email isn't Pass");
		}
				
		driver.quit(); 
		//close WebDriver

	}

}
