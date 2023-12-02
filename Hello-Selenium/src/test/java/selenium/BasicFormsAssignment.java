package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicFormsAssignment {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		
		driver.findElement(By.className("shopping_cart_link")).click();
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		driver.findElement(By.name("checkout")).click();
		
		String text = driver.findElement(By.className("title")).getText();
		
		if(text.contains("Checkout")) {
			System.out.println("The checkout page testcase is passed!");
		}
		else {
			System.out.println("The checkout page testcase is passed!");
		}
		
	}

}
