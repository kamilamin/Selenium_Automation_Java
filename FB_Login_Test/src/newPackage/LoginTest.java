package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Systems Training//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		WebElement signin = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		signin.click();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kamil.amin@live.co.uk");
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("kamil0213");
		
		WebElement LoginButton = driver.findElement(By.id("SubmitLogin"));
		LoginButton.click();
		
	}

}
