package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.numpyninja.com/contact");
		
		WebElement firstName = driver.findElement(By.name("first-name"));
		firstName.sendKeys("Jyo");
		
		WebElement lastName = driver.findElement(By.name("last-name"));
		lastName.sendKeys("N");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("N.test@test.com");
		
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("000000");
		
		WebElement enquiry = driver.findElement(By.id("textarea_comp-l1c0ku07"));
		enquiry.sendKeys("Hi");
		
		WebElement send = driver.findElement(By.id("comp-l1c0ku0e3"));
		send.click();
	}

}
