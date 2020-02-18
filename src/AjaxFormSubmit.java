import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AjaxFormSubmit {
	
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
		driver.get("https://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
		driver.manage().window().maximize();
	}
	
	public static void runTest() {
	
		WebElement name = driver.findElement(By.id("title"));
		name.sendKeys("Yari Mejia");
		WebElement desc = driver.findElement(By.id("description"));
		desc.sendKeys("This is just a test");
		WebElement submit = driver.findElement(By.id("btn-submit"));
		submit.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		String message = driver.findElement(By.id("submit-control")).getText();
		System.out.println(message);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Successfully')]")));
		String message2 = driver.findElement(By.id("submit-control")).getText();
		System.out.println(message2);
		
		driver.close();

	}

}
