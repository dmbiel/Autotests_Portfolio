package test_social_login;

import java.util.Iterator;
import java.util.Set;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main_Scenario_Login_Twitter {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/home/dmbiel/Staging_Tests/geckodriver"); //adding WebDriver
		
		WebDriver driver = new FirefoxDriver();  
		
		driver.get("https://staging.uptowork.workz.it/login");  // entering testing page
		
		Thread.sleep(500);   //time-out in test for operation on page
		
		driver.findElement(By.className("btn-social--twitter")).click();
		
		Thread.sleep(500); //time-out in test for operation on page
		
		String parentWindowHandler = driver.getWindowHandle(); // Store  parent window
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to pop-up window
		
		driver.findElement(By.name("session[username_or_email]")).sendKeys("dmbiel.test@gmail.com"); //finding form and sending e-mail to form
		
		
		driver.findElement(By.className("row_password")).sendKeys("Dima1234"); //finding form and sending password to form
		
		Thread.sleep(500); //time-out in test for operation on page
		
		driver.findElement(By.id("allow")).submit(); //submit the form
		
		Thread.sleep(500); //time-out in test for operation on page
		
		driver.switchTo().window(parentWindowHandler);  // switch back to parent window
		
		Thread.sleep(5000);  //time-out in test for operation on page
		
		System.out.println(driver.getTitle()); //get test results
		
		if (driver.getTitle().contentEquals("User's panel | Uptowork")) 
		{
		JOptionPane.showMessageDialog(null,"Test Login Existing User is Pass");
		}
		else 
		{
		JOptionPane.showMessageDialog(null,"Test Login Existing User isn't Pass");
		}
				
		driver.quit();

	}

}
