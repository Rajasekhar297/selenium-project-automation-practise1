import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertex {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		// Using Alert options 
		 driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		 
		Alert ale = driver.switchTo().alert();
		
		//now using the ok button using accept method
		
		ale.accept();		
		

	}

}
