package test_moving_from_login_page;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Additional_Scenario_Registration_with_empty_password {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Eclipse\\selenium-java-3.9.1\\geckodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://staging.uptowork.workz.it/login");
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		Thread.sleep(500);
			
		driver.findElement(By.name("email")).sendKeys("dimona.aviatur@gmail.com");
		
		Thread.sleep(500);
		
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(5000);
		
        String alert = driver.findElement(By.className("form__error")).getAttribute("data-message");
		
		if (alert.equals("Wrong password"))
		{
		JOptionPane.showMessageDialog(null,"Test Registering Using Empty Password is Pass");
		}
		else 
		{
		JOptionPane.showMessageDialog(null,"Test Registering Using Empty Password isn't Pass");
		}
				
		driver.quit();

	}

}
