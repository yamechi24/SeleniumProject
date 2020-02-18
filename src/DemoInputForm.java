
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoInputForm {
	
	static String browser;
	static WebDriver driver;

	public static void main(String[] args) {
		
		setBrowser();
		setBrowserConfig();
		runTest();
	}
	
	public static void setBrowser() {

		browser="Chrome";
	}
	
	public static void setBrowserConfig() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QIS8\\Tools\\drivers\\chromedriver.exe");  
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\QIS8\\Tools\\drivers\\geckodriver.exe"); 
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		driver.manage().window().maximize();
	}
	
	public static void runTest() {
				
		WebElement fName = driver.findElement(By.xpath("//input[@name='first_name']"));
		fName.sendKeys("Yari");
		
		WebElement lName = driver.findElement(By.xpath("//input[@name='last_name']"));
		lName.sendKeys("Mejia");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("yamechi@hotmail.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("8097567292");
		
		WebElement address = driver.findElement(By.xpath("//input[@name='address']"));
		address.sendKeys("23 Summer Bay avenue");
		
		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("Orlando");
		
		Select option = new Select(driver.findElement(By.name("state")));
		option.selectByVisibleText("Florida");
		
		WebElement zip = driver.findElement(By.xpath("//input[@name='zip']"));
		zip.sendKeys("32789");
		
		WebElement website = driver.findElement(By.xpath("//input[@name='website']"));
		website.sendKeys("yari.com");
		
		WebElement hostingOpt = driver.findElement(By.xpath("//input[@value='yes']"));
		hostingOpt.click();
		
		WebElement projectDesc = driver.findElement(By.xpath("//textarea[@name='comment']"));
		projectDesc.sendKeys("Test Project");
		
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
				
		driver.close();

	}

}
