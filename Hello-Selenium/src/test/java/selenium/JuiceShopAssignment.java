package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JuiceShopAssignment {
	
	public static WebDriver driver;
	
	public static void register(WebDriver driver) {
		
	    driver.findElement(By.xpath("//a[text()='Not yet a customer?']")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		driver.findElement(By.id("emailControl")).sendKeys("testingg@abc.com");
		driver.findElement(By.id("passwordControl")).sendKeys("test123");
		driver.findElement(By.id("repeatPasswordControl")).sendKeys("test123");
		driver.findElement(By.id("mat-select-value-1")).click();
		driver.findElement(By.id("mat-option-1")).click();
		driver.findElement(By.id("securityAnswerControl")).sendKeys("It is abcdefgh");
		driver.findElement(By.id("registerButton")).click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://juice-shop.herokuapp.com/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		register(driver);
		
		driver.findElement(By.id("email")).sendKeys("testingg@abc.com");
		driver.findElement(By.id("password")).sendKeys("test123");
		
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//a[text()='Me want it!']")).click();
		
		driver.findElement(By.xpath("//div[text()=' Carrot Juice (1000ml) ']/../../..//button")).click();
//		Actions action = new Actions(driver);
//		
//		WebElement MelonBikeAddToCart = driver.findElement(By.xpath("//div[text()=' Melon Bike (Comeback-Product 2018 Edition) ']/../../..//button"));
//        MelonBikeAddToCart.click();
		
//		WebElement lemonJuiceAddToCart = driver.findElement(By.xpath("//div[text()=' Lemon Juice (500ml) ']/../../..//button"));
//		action.click(lemonJuiceAddToCart).perform();
		
		WebElement nextPage = driver.findElement(By.xpath("//div[@class='mat-paginator-range-actions']//button[@aria-label= 'Next page']//span"));
        nextPage.click();
		
		WebElement juiceShopStickerAddToCart = driver.findElement(By.xpath("//div[text()=' OWASP Juice Shop Sticker Single ']/../../..//button"));
		juiceShopStickerAddToCart.click();
	
//		WebElement juiceShopHoodieAddToCart = driver.findElement(By.xpath("//div[text()=' OWASP Juice Shop Hoodie ']/../../..//button"));
//		juiceShopHoodieAddToCart.click();
		
		nextPage.click();
		
		WebElement quinceJuiceAddToCart = driver.findElement(By.xpath("//div[text()=' Quince Juice (1000ml) ']/../../..//button"));
		quinceJuiceAddToCart.click();
		
		driver.findElement(By.xpath("//span[text()=' Your Basket']")).click();
		driver.findElement(By.xpath("//mat-cell[text()=' Carrot Juice (1000ml) ']/..//button[2]")).click();
		driver.findElement(By.xpath("//mat-cell[text()=' OWASP Juice Shop Sticker Single ']/..//button[2]")).click();
		driver.findElement(By.xpath("//mat-cell[text()=' Quince Juice (1000ml) ']/..//button[2]")).click();
        driver.findElement(By.id("checkoutButton")).click();
        
        driver.findElement(By.xpath("//span[text()='Add New Address']")).click();
        
        driver.findElement(By.xpath("//input[@data-placeholder='Please provide a country.']")).sendKeys("USA");
        driver.findElement(By.xpath("//input[@data-placeholder='Please provide a name.']")).sendKeys("abcd");
        driver.findElement(By.xpath("//input[@data-placeholder='Please provide a mobile number.']")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@data-placeholder='Please provide a ZIP code.']")).sendKeys("121234");
        driver.findElement(By.xpath("//input[@data-placeholder='Please provide an address.']")).sendKeys("efgh");
        driver.findElement(By.xpath("//input[@data-placeholder='Please provide a city.']")).sendKeys("hijk");
        driver.findElement(By.xpath("//input[@data-placeholder='Please provide a state.']")).sendKeys("lmnop");
        
        driver.findElement(By.id("submitButton")).click();

        
        
	}
	
	
	

}
