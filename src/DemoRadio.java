import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoRadio {
	
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
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		driver.manage().window().maximize();
	}
	
	public static void runTest() {
				
		WebElement option = driver.findElement(By.xpath("//input[@name='optradio']"));
		option.click();
		WebElement message = driver.findElement(By.id("buttoncheck"));
		message.click();
		
		WebElement sexOption = driver.findElement(By.xpath("//input[@name='gender']"));
		sexOption.click();
		WebElement ageOption = driver.findElement(By.xpath("//input[@value='5 - 15']"));
		ageOption.click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Get values')]")).click();
		driver.close();

	}

}
