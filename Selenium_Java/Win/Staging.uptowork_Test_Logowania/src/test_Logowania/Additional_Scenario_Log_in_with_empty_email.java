package test_Logowania;

import javax.swing.JOptionPane;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Additional_Scenario_Log_in_with_empty_email {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Eclipse\\selenium-java-3.9.1\\geckodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();

		driver.get("https://staging.uptowork.workz.it/login");
		Thread.sleep(5);
		
		driver.findElement(By.name("password")).sendKeys("Dima1234");
		
		Thread.sleep(500);
		
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(500);
		
		String alert = driver.findElement(By.className("form__error")).getAttribute("data-message");
		
		if (alert.equals("Wrong e-mail address")) 
		{
		JOptionPane.showMessageDialog(null,"Test Login Existing User with Empty Email is Pass");
		}
		else 
		{
		JOptionPane.showMessageDialog(null,"Test Login Existing User with Empty Email isn't Pass");
		}
				
		driver.quit();

	}

}
