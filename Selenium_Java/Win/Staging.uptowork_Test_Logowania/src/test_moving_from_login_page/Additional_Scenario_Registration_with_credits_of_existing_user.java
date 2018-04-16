package test_moving_from_login_page;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Additional_Scenario_Registration_with_credits_of_existing_user {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Eclipse\\selenium-java-3.9.1\\geckodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://staging.uptowork.workz.it/login");
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		Thread.sleep(500);
		
        driver.findElement(By.name("email")).sendKeys("Dmbiel.test@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Dima1234");
		
		Thread.sleep(500);
		
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(5000);
				
		if (driver.getTitle().equals("User's panel | Uptowork")) 
		{
		JOptionPane.showMessageDialog(null,"Test Registering Using Credits of Existing User is Pass");
		}
		else 
		{
		JOptionPane.showMessageDialog(null,"Test Registering Using Credits of Existing User isn't Pass");
		}
				
		driver.quit();

	}

}
