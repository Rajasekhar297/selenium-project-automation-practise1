import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class example {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");	

	WebElement button = driver.findElement(By.name("q"));
	
	button.sendKeys("Iphone14");
	
	button.submit();
	
	
	List<WebElement> links = driver.findElements(By.tagName("a"));
	
	int count = links.size();
	
	
	
	System.out.println(count);
	
	for(int i = 0; i < count ; i++) {
	
	System.out.println(links.get(i).getText());
	
	
	
	}
	
	
	
	}
}

