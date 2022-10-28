import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver kosmic = new ChromeDriver();
		
		kosmic.get("https://www.amazon.in/");
		
		kosmic.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		
		kosmic.findElement(By.id("nav-logo-sprites")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
				
		

	}

}
