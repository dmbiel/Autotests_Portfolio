package test_moving_from_login_page;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main_Scenario_Reset_Password_Coming_Back {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Eclipse\\selenium-java-3.9.1\\geckodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://staging.uptowork.workz.it/login");
		
		driver.findElement(By.linkText("Reset password")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.linkText("Log In Now")).click();
		
		Thread.sleep(5000);
						
		if (driver.getTitle().equals("Log In | Uptowork")) 
		{
		JOptionPane.showMessageDialog(null,"Test Cancel Reset Password is Pass");
		}
		else 
		{
		JOptionPane.showMessageDialog(null,"Test Cancel Reset Password isn't Pass");
		}
				
		driver.quit();

	}

}
