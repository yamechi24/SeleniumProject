import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoCheckbox {
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

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\QIS8\\Tools\\drivers\\chromedriver.exe");  
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\QIS8\\Tools\\drivers\\geckodriver.exe"); 
		driver = new FirefoxDriver();
		//driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		driver.manage().window().maximize();
	}

	public static void runTest() {
		driver.findElement(By.id("isAgeSelected")).click();
		String message = driver.findElement(By.id("txtAge")).getText();
		System.out.println(message);

		driver.findElement(By.id("check1")).click();
		WebElement valueText = driver.findElement(By.id("check1")); 
		String text = valueText.getAttribute("value");
		System.out.println("Checkbox is displayed as: " +text);

		List<WebElement> cbs = driver.findElements(By.className("cb1-element"));

		// List<WebElement els = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for ( WebElement cb : cbs ) {
			if ( cb.isSelected() ) {
				cb.click();
			}
		}

		String text2 = valueText.getAttribute("value");
		System.out.println("Checkbox is displayed as: " +text2);
		
		driver.close();
	}

}
