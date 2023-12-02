package selenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JuiceShop_Register {
	
	public static WebDriver driver =  new ChromeDriver();;
	String url = "https://juice-shop.herokuapp.com/#/register";
	
	By dismissbtn = By.xpath("//button[@aria-label= 'Close Welcome Banner']");
	By email = By.id("emailControl");
	By pwd = By.id("passwordControl");
	By repeatpwd = By.id("repeatPasswordControl");
	By security = By.id("mat-select-value-1");
	By question = By.xpath("//*[@id='mat-option-1']");
	By answer = By.id("securityAnswerControl");
	
	public void Register() {
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(dismissbtn).click();
		driver.findElement(email).sendKeys("test@123.com");
		driver.findElement(pwd).sendKeys("test123");
		driver.findElement(repeatpwd).sendKeys("test123");
		driver.findElement(security).click();
		driver.findElement(question).click();
		driver.findElement(answer).sendKeys("testing");
	}
	
	public static void main(String[] args) {
		
		 JuiceShop_Register obj = new JuiceShop_Register();
		 obj.Register();
		
	}
}
