package test_moving_from_login_page;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Additional_Scenario_Registration_with_empty_email {

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
			
		driver.findElement(By.name("password")).sendKeys("Dima1234");
		
		Thread.sleep(500); 
		//time-out in test for operation on page
		
		driver.findElement(By.name("submit")).click(); 
		//submit the form
		
		Thread.sleep(5000); 
		//time-out in test for operation on page
		
        String alert = driver.findElement(By.className("form__error")).getAttribute("data-message"); 
        //get test results
		
		if (alert.equals("Wrong e-mail address"))
		{
		JOptionPane.showMessageDialog(null,"Test Registering Using Empty Email is Pass");
		}
		else 
		{
		JOptionPane.showMessageDialog(null,"Test Registering Using Empty Email isn't Pass");
		}
				
		driver.quit(); 
		//close WebDriver

	}

}
