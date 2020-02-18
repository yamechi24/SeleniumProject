import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QIS8\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("#username")).sendKeys("Yari");
		driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
	}

}
