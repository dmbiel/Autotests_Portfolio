package test_social_login;

import java.util.Iterator;
import java.util.Set;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main_Scenario_Login_Google {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Eclipse\\selenium-java-3.9.1\\geckodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://staging.uptowork.workz.it/login");
		
		Thread.sleep(500);
		
		driver.findElement(By.className("btn-social--google")).click();
		
		Thread.sleep(500);
		
		String parentWindowHandler = driver.getWindowHandle(); // Store  parent window
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to pop-up window
		
		driver.findElement(By.name("identifier")).sendKeys("dmbiel.test@gmail.com");
		
		Thread.sleep(500);
		
		driver.findElement(By.id("identifierNext")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.name("password")).sendKeys("Dima1234");
		
		Thread.sleep(500);
		
		driver.findElement(By.className("CwaK9")).click();
		
		Thread.sleep(500);
		
		driver.switchTo().window(parentWindowHandler);  // switch back to parent window
		
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		
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
