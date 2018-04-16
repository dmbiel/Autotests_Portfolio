package test_moving_from_login_page;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Additional_Scenario_Reseting_with_empty_email {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Eclipse\\selenium-java-3.9.1\\geckodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://staging.uptowork.workz.it/login");
		
		driver.findElement(By.linkText("Reset password")).click();
		
		Thread.sleep(500);
				
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(500);
		
        String alert = driver.findElement(By.className("form__error")).getAttribute("data-message");
		
		if (alert.equals("Value is required and can't be empty")) 
		{
		JOptionPane.showMessageDialog(null,"Test Reset Password with empty email is Pass");
		}
		else 
		{
		JOptionPane.showMessageDialog(null,"Test Reset Password with empty email isn't Pass");
		}
				
		driver.quit();

	}

}
