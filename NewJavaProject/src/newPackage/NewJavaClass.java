package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewJavaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Systems Training//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		//WebElement signin = driver.findElement(By.className("login"));
		
		WebElement signin = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		signin.click();
		
		WebElement enterEmail = driver.findElement(By.id("email_create"));
		enterEmail.sendKeys("kamil.amin@live.co.uk");
		
		WebElement CreateAccount = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
		CreateAccount.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement RadioButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender1")));
		RadioButton.click();
		
		WebElement Firstname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer_firstname")));
		Firstname.sendKeys("Muhammad kamil");

		WebElement LastName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customer_lastname']")));
		LastName.sendKeys("Amin");
		
		WebElement PW = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='passwd']")));
		PW.sendKeys("kamil0213");
		
		Select DropDays = new Select(driver.findElement(By.id("days")));
		DropDays.selectByIndex(8);
		
		Select DropMonths=new Select(driver.findElement(By.id("months")));
		DropMonths.selectByIndex(03);

		Select Dropyears=new Select(driver.findElement(By.id("years")));
		Dropyears.selectByIndex(24);
		
		WebElement NewLetter = driver.findElement(By.xpath("//input[@id='newsletter']"));
		NewLetter.click();
		
		WebElement ReceiveOffer = driver.findElement(By.xpath("//input[@id='optin']"));
		ReceiveOffer.click();
		
//		Address Section
		
		WebElement Company = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("company")));
		Company.sendKeys("Systems Limited");
		
		WebElement Address1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='address1']")));
		Address1.sendKeys("Plot # abc Block # def, Karachi, Pakistan");
		
		WebElement Address2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='address2']")));
		Address2.sendKeys("Building");
		
		WebElement city = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='city']")));
		city.sendKeys("Karachi");
		
		Select Dropstate=new Select(driver.findElement(By.id("id_state")));
		Dropstate.selectByIndex(1);
		
		Select DropCountry=new Select(driver.findElement(By.id("id_country")));
		DropCountry.selectByIndex(1);
		
		WebElement psCode = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='postcode']")));
		psCode.sendKeys("75290");
		
		WebElement Info = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='other']")));
		Info.sendKeys("Test selenium");
		
		WebElement HomePhone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='phone']")));
		HomePhone.sendKeys("0123456789");
		
		WebElement MobPhone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='phone_mobile']")));
		MobPhone.sendKeys("9876543210");
		
		WebElement AddressAlias = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='alias']")));
		AddressAlias.clear();
		AddressAlias.sendKeys("KHI");
		
		WebElement RegButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submitAccount")));
		RegButton.click();
		
	}
	
}
