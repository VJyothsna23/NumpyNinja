package selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JuiceShopAssignmentPOM {
	
	public static WebDriver driver;
	
	@FindBy (xpath = "//a[text()='Not yet a customer?']") WebElement notACustomer;
	@FindBy (xpath = "//span[text()='Dismiss']") WebElement dismissBtn;
	@FindBy (id = "emailControl") WebElement email;
	@FindBy (id = "passwordControl") WebElement pwd;
	@FindBy (id = "repeatPasswordControl") WebElement repeatPwd;
	@FindBy (id = "mat-select-value-1") WebElement selectQuestion;
	@FindBy (id = "mat-option-1") WebElement option;
	@FindBy (id = "securityAnswerControl") WebElement answer;
	@FindBy (id = "registerButton") WebElement register;
	@FindBy (id = "email") WebElement emailEle;
	@FindBy (id = "password") WebElement password;
	@FindBy (id = "loginButton") WebElement loginBtn;
	@FindBy (xpath = "//a[text()='Me want it!']") WebElement cookies;
	@FindBy (xpath = "//div[text()=' Carrot Juice (1000ml) ']/../../..//button") WebElement carrotJuiceAddToCart;
	@FindBy (xpath = "//div[text()=' Melon Bike (Comeback-Product 2018 Edition) ']/../../..//button") WebElement MelonBikeAddToCart;
	@FindBy (xpath = "//div[text()=' Lemon Juice (500ml) ']/../../..//button") WebElement lemonJuiceAddToCart;
	@FindBy (xpath = "//div[@class='mat-paginator-range-actions']//button[@aria-label= 'Next page']") WebElement nextPage;
	@FindBy (xpath = "//div[text()=' OWASP Juice Shop Sticker Single ']/../../..//button") WebElement juiceShopStickerAddToCart;
	@FindBy (xpath = "//div[text()=' OWASP Juice Shop Hoodie ']/../../..//button") WebElement juiceShopHoodieAddToCart;
	@FindBy (xpath = "//div[text()=' Woodruff Syrup \"Forest Master X-Treme\" ']/../../..//button") WebElement syrupAddToCart;

	public WebDriver initDriver() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://juice-shop.herokuapp.com/#/login");
		return driver;
	}
	
	public void juiceShopRegister() {
		
		PageFactory.initElements( initDriver(), this);
		notACustomer.click();
		dismissBtn.click();
		email.sendKeys("testin@abcd.com");
		pwd.sendKeys("test123");
		repeatPwd.sendKeys("test123");
		selectQuestion.click();
		option.click();
		answer.sendKeys("It is abcdefgh");
		register.click();
	}
	
	public void juiceShopLogin() {
		
		driver = initDriver();
		PageFactory.initElements(driver , this);
//		dismissBtn.click();
//		cookies.click();
		emailEle.sendKeys("testing@abc.com");
		password.sendKeys("test123");
		loginBtn.click();
		
		dismissBtn.click();
		cookies.click();
		
		carrotJuiceAddToCart.click();
		
		Actions action = new Actions(driver);
		action.click(MelonBikeAddToCart).perform();
		action.click(lemonJuiceAddToCart).perform();
		action.scrollToElement(nextPage).click().perform();
		PageFactory.initElements(driver , this);
		action.click(juiceShopHoodieAddToCart).perform();
		action.click(juiceShopStickerAddToCart).perform();
		action.scrollToElement(nextPage).click().perform();
		PageFactory.initElements(driver , this);
		action.click(syrupAddToCart).perform();
	}

	public static void main(String[] args) {
		
		JuiceShopAssignmentPOM obj = new JuiceShopAssignmentPOM();
		
 //       obj.juiceShopRegister();
		obj.juiceShopLogin();
	}

}
