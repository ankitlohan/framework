package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Exelib {

		WebDriver driver;
	
	public String open(String URL) {
		
		driver.get(URL);
		return "pass";
	}
	
	public String User(String UN) {
		driver.findElement(By.id("txtUsername")).sendKeys(UN);
		return "pass";
	}
		
	
	public String Password(String PWD) {
		driver.findElement(By.id("txtPassword")).sendKeys(PWD);
		return "pass";
	}
		
	public void close() {

		driver.quit();
		
	}
	
	
	
	
	
	
	
}
