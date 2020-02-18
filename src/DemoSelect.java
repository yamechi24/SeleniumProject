import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSelect {
	
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
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
	}
	
	public static void runTest() {
		
		Select selection = new Select(driver.findElement(By.id("select-demo")));
		selection.selectByValue("Saturday");
		
		String message = driver.findElement(By.xpath("//p[contains(text(),'Day selected')]")).getText();
		System.out.println(message);
		
		
		Select multiSelection = new Select(driver.findElement(By.id("multi-select")));
		multiSelection.selectByValue("Florida");
		multiSelection.selectByValue("Ohio");
		
		WebElement firstSelected = driver.findElement(By.id("printMe"));
		firstSelected.click();
		String firstMessage = driver.findElement(By.className("getall-selected")).getText();
		System.out.println(firstMessage);
		
		WebElement allSelected = driver.findElement(By.id("printAll"));
		allSelected.click();
		String allMessage = driver.findElement(By.className("getall-selected")).getText();
		System.out.println(allMessage);
		
		driver.close();
		
		
	}

}
