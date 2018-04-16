package test_moving_from_login_page;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Additional_Scenario_Reseting_with_wrong_email {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Eclipse\\selenium-java-3.9.1\\geckodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://staging.uptowork.workz.it/login");
		
		driver.findElement(By.linkText("Reset password")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.name("email")).sendKeys("sdfsdf");

		Thread.sleep(5000);
		
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(500);
		
        String alert = driver.findElement(By.className("form__error")).getAttribute("data-message");
		
		if (alert.equals("The input is not a valid email address. Use the basic format local-part@hostname")) 
		{
		JOptionPane.showMessageDialog(null,"Test Reset Password with wrong email is Pass");
		}
		else 
		{
		JOptionPane.showMessageDialog(null,"Test Reset Password with wrong email isn't Pass");
		}
				
		driver.quit();

	}

}
