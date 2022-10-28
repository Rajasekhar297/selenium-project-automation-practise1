

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchbrowserdriver {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver kosmic = new ChromeDriver();
		
		kosmic.get("https://www.flipkart.com/");
		
		kosmic.findElement(By.name("q")).sendKeys("Iphone");
		
		kosmic.findElement(By.className("L0Z3Pu")).click();
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
	
	

	}

}
