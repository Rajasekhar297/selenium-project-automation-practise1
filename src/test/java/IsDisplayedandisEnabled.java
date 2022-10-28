import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayedandisEnabled {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		WebElement kosmic = driver.findElement(By.name("q"));
		
		if(kosmic.isDisplayed()&&kosmic.isEnabled()) {
			System.out.println("Pass");
			
		}else {
			System.out.println("Fail");
			
		}
		
		
		
	}

}
