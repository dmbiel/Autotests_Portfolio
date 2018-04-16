package test_Logowania;

import javax.swing.JOptionPane;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Additional_Scenario_Log_in_with_wrong_credits {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Eclipse\\selenium-java-3.9.1\\geckodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://staging.uptowork.workz.it/login");
		
		Thread.sleep(5);
		
		driver.findElement(By.name("email")).sendKeys("Dmbiel.test@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Dimu1234");
		
		Thread.sleep(500);
		
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(500);
		
		String tagName = driver.findElement(By.className("modal-close")).getTagName();
		
		if (tagName.equals("a")) 
		{
		JOptionPane.showMessageDialog(null,"Test Login Existing User with Wrong Credentials is Pass");
		}
		else 
		{
		JOptionPane.showMessageDialog(null,"Test Login Existing User with Wrong Credentials isn't Pass");
		}
				
		driver.quit();

	}

}
