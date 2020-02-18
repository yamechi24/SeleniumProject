import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JQuerySelectDropDown {
	
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
		driver.get("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
		driver.manage().window().maximize();
	}
	
	public static void runTest() {
				
		Select selectCountry = new Select (driver.findElement(By.id("country")));
		selectCountry.selectByValue("Denmark");
		
		WebElement state1 = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		state1.sendKeys("FLO");
		state1.sendKeys(Keys.ENTER);
		
		WebElement state2 = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		state2.sendKeys("TEX");
		state2.sendKeys(Keys.ENTER);
		
		WebElement disValc = driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[2]"));
		disValc.click();
		WebElement disVal = driver.findElement(By.xpath("(//input[@class='select2-search__field'])[2]"));
		disVal.click();
		disVal.sendKeys("PUER");
		state2.sendKeys(Keys.ENTER);
		
		Select file = new Select(driver.findElement(By.id("files")));
		file.selectByVisibleText("Java");
		
		driver.close();
		
		
		
		
		

	}

}
