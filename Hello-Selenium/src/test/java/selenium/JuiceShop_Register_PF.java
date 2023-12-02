package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JuiceShop_Register_PF {
	
	public static WebDriver driver =  new ChromeDriver();;
	String url = "https://juice-shop.herokuapp.com/#/register";
	
	@FindBy(xpath = "//button[@aria-label= 'Close Welcome Banner']") WebElement dismissbtn;
	@FindBy(id = "emailControl") WebElement email;
	@FindBy(id = "passwordControl") WebElement pwd;
	@FindBy(id = "repeatPasswordControl") WebElement repeatpwd;
	@FindBy(id = "mat-select-value-1") WebElement security;
	@FindBy(xpath = "//*[@id='mat-option-1']") WebElement question;
	@FindBy(id = "securityAnswerControl") WebElement answer;
	
	public void Register() {
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		PageFactory.initElements(driver, this);//re-initializing all the webElements
		
		dismissbtn.click();
		email.sendKeys("test@123.com");
		pwd.sendKeys("test123");
		repeatpwd.sendKeys("test123");
		security.click();
		question.click();
		answer.sendKeys("testing");
	}
	
	public static void main(String[] args) {
		
		JuiceShop_Register_PF obj = new JuiceShop_Register_PF();
		 obj.Register();
		
	}

}
