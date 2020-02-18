import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_6 {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QIS8\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//1. Navigate to qaclickacademy.com
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		// 2. Select any checkbox, and grab the label of the selected checkbox // put it in a variable and use that variable
		driver.findElement(By.id("checkBoxOption1")).click();
		String text = driver.findElement(By.id("checkBoxOption1")).getAttribute("value");
				
		//3. Go to the dropdown and select the option,  which is the label of the selected checkbox // do not hardcode text
		Select optionSelected = new Select(driver.findElement(By.id("dropdown-class-example")));
		optionSelected.selectByValue(text);
		
		//4. Enter the step 2 grabbed label text in edit box 
		driver.findElement(By.id("name")).sendKeys(text);
		
		//5. Click on Alert and then verify if text grabbed from step 2 is present in popup message
		driver.findElement(By.id("alertbtn")).click();
		
		String alertText = driver.switchTo().alert().getText();	
		
		
		if(alertText.contains(text)) {
			System.out.println(text +" is present in the Alert");	
		}else
		{
			System.out.println(text +" is NOT present in the Alert");
		}
		
				
	}

}
