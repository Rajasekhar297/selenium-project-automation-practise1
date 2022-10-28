import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigationmethodinselenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//Step 1: OpenBrowser
		driver.get("https://www.google.com/");
		
		//Step 2: Click on Gmail link by Using linktext
		 driver.findElement(By.linkText("Gmail"));
		 
	
		 
		 
		//Step 3: Browser Back Button
		driver.navigate().back();
		
		//Step 4: Browser Forward button
		
		driver.navigate().forward();
		
		//Step 5: Browser Refresh button
		driver.navigate().refresh();
		
		
		
		
		
		
		
		
		
		
		
	}

}
