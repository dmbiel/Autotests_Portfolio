package test_moving_from_login_page;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main_Scenario_Reseting_Password {

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
		
		driver.findElement(By.name("email")).sendKeys("Dmbiel.test@gmail.com"); 
		//finding form and sending e-mail to form

		Thread.sleep(5000); 
		//time-out in test for operation on page
		
		driver.findElement(By.name("submit")).click(); 
		//submit the form
		
		Thread.sleep(500);
		//time-out in test for operation on page
		
        String tagName = driver.findElement(By.className("modal-close")).getTagName(); 
        //get test results
		
		if (tagName.equals("a")) 
		{
		JOptionPane.showMessageDialog(null,"Test Reset Password is Pass");
		}
		else 
		{
		JOptionPane.showMessageDialog(null,"Test Reset Password isn't Pass");
		}
				
		driver.quit();
		//close WebDriver

	}

}
