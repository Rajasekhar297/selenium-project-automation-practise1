import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HoverEx {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		//Sync
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Step1: Open Browser of Myntra
		driver.get("https://www.myntra.com/");
		//Step2: hover to the men Element
		
		Actions myntra = new Actions(driver);
		
		WebElement menbutton = driver.findElement(By.linkText("MEN"));
		
		myntra.moveToElement(menbutton).perform();
		
		driver.findElement(By.linkText("Shorts")).click();
		
		
		
		

	}

}
