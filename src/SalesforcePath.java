import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforcePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QIS8\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		//Using xpaths
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("myOwnXpath");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("myOwnPw");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//Using cssSelector
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("hola");
		driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input[name='Login']")).click();
		
	}

}
