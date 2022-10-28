import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isSelected {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//Sync
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Step1;open Browswer
		driver.get("https://www.google.com/");

		WebElement Kosmic = driver.findElement(By.name("q"));
		System.out.println(Kosmic.isEnabled());
		
		
		
	}

}
