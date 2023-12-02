package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TutorialsNinjaAssignment {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//step:1
		driver.get("https://tutorialsninja.com/demo/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//step:2
		driver.findElement(By.id("form-currency")).click();//currency element
		driver.findElement(By.name("EUR")).click();//Euro option
		//step:3
		driver.findElement(By.linkText("Canon EOS 5D")).click();//Canon element
		driver.findElement(By.id("button-cart")).click();//add-to-cart element
		String selectError = driver.findElement(By.xpath("//div[@class='text-danger']")).getText();//error message
		System.out.println("The error message at step 3 says: " + selectError);
		//step:4
		driver.findElement(By.linkText("Qafox.com")).click();//homepage element
		driver.findElement(By.linkText("iPhone")).click();// iphone element
		WebElement quantity = driver.findElement(By.name("quantity"));//Qty element
		quantity.clear();//clear the text box since it has 1 as default
		quantity.sendKeys("2");//entering 2 in the Qty text field
		driver.findElement(By.id("button-cart")).click();//add-to-cart element
		//step:5
		String successMessage = driver.findElement(By.className("alert-success")).getText();//success message
		System.out.println("The success message at step 5 says: "+ successMessage);
		//step:6
		driver.findElement(By.id("cart-total")).click();//cart icon
		driver.findElement(By.xpath("//a[@href='https://tutorialsninja.com/demo/index.php?route=checkout/cart']")).click();//view cart 
	    //step:7
		WebElement qty = driver.findElement(By.xpath("//input[@type='text' and @size='1']"));//quantity element
		qty.clear();
		qty.sendKeys("3");//changing the qty from 2 to 3
		driver.findElement(By.xpath("//button[@type='submit']")).click();//update button
		//step:8
		String ecoTax = driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-8']/table/tbody/tr[2]/td[2]")).getText();
		System.out.println("The ECO Tax amount is: "+ ecoTax);
		
		String vat = driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-8']/table/tbody/tr[3]/td[2]")).getText();
		System.out.println("The VAT amount is: "+ vat);
		driver.findElement(By.linkText("Checkout")).click();
		//step:9
		String error = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
	    System.out.println("The error message at step 9 says: " + error);
	    driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();//remove button
	    
	    //step:10- no idea why lines 57 or 58 not working for home page. combination is working
//	    driver.findElement(By.xpath("//a[@href='https://tutorialsninja.com/demo/index.php?route=common/home']")).click();//home page element
//	    driver.findElement(By.linkText("Qafox.com")).click();//logo element
	    driver.findElement(By.linkText("Continue")).click();//Continue element
	    driver.findElement(By.linkText("MacBook")).click();//MacBook element
	    WebElement quant = driver.findElement(By.name("quantity"));//quantity element
	    if(quant.getAttribute("value").equals("1")) {//verifying default quantity value
	    	System.out.println("Default quantity is 1" );
	    }
	    else {
	    	System.out.println("Default quantity is not 1");
	    }
	    
	    driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();//add to cart button
	    String success = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();//success message
	    System.out.println("The Success message at step 10 says: " + success);
	    if(success.contains("Success")) {//verifying success message
	    	System.out.println("Success message is verified. Test(step 10) passed!");
	    }
	    else {
	    	System.out.println("Test(step 10) failed!");
	    }
	    //step:11
	    driver.findElement(By.xpath("//div[@id='cart']/button")).click();//cart element
	    driver.findElement(By.xpath("//p[@class='text-right']/a[1]")).click();//view cart
	    driver.findElement(By.xpath("//a[text()='Use Coupon Code ']")).click();//coupon code element
	    driver.findElement(By.name("coupon")).sendKeys("ABCD123");
	    driver.findElement(By.id("button-coupon")).click();//Apply coupon
	    String couponError = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
	    System.out.println("The coupon error message at step 11 says: "+ couponError);
	    
	    //step:12 - wrong error message in the console
	    driver.findElement(By.xpath("//a[text()='Use Gift Certificate ']")).click();//gift cert element
	    driver.findElement(By.name("voucher")).sendKeys("AXDFGH123");
	    driver.findElement(By.id("button-voucher")).click();//Apply Gift Certificate button
	    String giftError = driver.findElement(By.xpath("//div[@id='checkout-cart']//div[@class='alert alert-danger alert-dismissible']")).getText();
	    System.out.println("The Gift Certificate error message at step 12 says: "+ giftError);//wrong error is printing
	    //step:13
	    driver.findElement(By.name("voucher")).clear();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[text()='Use Coupon Code ']")).click();//coupon code element
	    Thread.sleep(3000);
	    driver.findElement(By.name("coupon")).clear();
	    driver.findElement(By.xpath("//a[text()='Use Coupon Code ']")).click();
	    driver.findElement(By.linkText("Checkout")).click();
	    //step:14
	    driver.findElement(By.xpath("//input[@id='button-account']")).click();
	    driver.findElement(By.name("firstname")).sendKeys("J");
	    driver.findElement(By.name("lastname")).sendKeys("V");
	    driver.findElement(By.id("input-payment-email")).sendKeys("testing@112.com");
	    driver.findElement(By.name("telephone")).sendKeys("123456789");
	    driver.findElement(By.id("input-payment-password")).sendKeys("test123");
	    driver.findElement(By.name("confirm")).sendKeys("test123");
	    driver.findElement(By.name("company")).sendKeys("abcd");
	    driver.findElement(By.name("address_1")).sendKeys("efgh");
	    driver.findElement(By.name("address_2")).sendKeys("ijkl");
	    driver.findElement(By.name("city")).sendKeys("mnop");
	    driver.findElement(By.name("postcode")).sendKeys("12345");
	    
	    WebElement country = driver.findElement(By.name("country_id"));
	    Select select1 = new Select(country);
	    select1.selectByVisibleText("United States");
	    
	    WebElement state = driver.findElement(By.name("zone_id"));
	    Select select2 = new Select(state);
	    select2.selectByVisibleText("Washington");
	    
	    driver.findElement(By.name("agree")).click();
	    driver.findElement(By.id("button-register")).click();
	    
	    //Step:15
	    driver.findElement(By.name("comment")).sendKeys("Please deliver within 5 days! ");
	    driver.findElement(By.name("agree")).click();
	    driver.findElement(By.id("button-payment-method")).click();
	    String paymentError = driver.findElement(By.xpath("//div[@class='panel-body']/div[@class='alert alert-danger alert-dismissible']")).getText();
	    System.out.println("Payment Error message at step 15 says: "+ paymentError);
	    
	    //step:16
	    driver.findElement(By.linkText("Contact Us")).click();//contact us button
	    driver.findElement(By.name("name")).sendKeys("Jack");//name field
	    driver.findElement(By.id("input-enquiry")).sendKeys("What is your contact email address?");//enquiry field
	    driver.findElement(By.xpath("//input[@value='Submit']")).click();//submit button
	    driver.findElement(By.linkText("Continue")).click();
	}
	
	

}
