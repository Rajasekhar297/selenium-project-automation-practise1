import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linksvisibleandinvisible {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int indexvalue = links.size();
		int count= 0;
		System.out.println(indexvalue);
		for(int i= 0; i<= indexvalue; i++) {
			if(!links.get(i).getText().isEmpty()) 
			{
				count++;
				
			}
			
		}System.out.println("Visible Links are :"+ count);
		System.out.println("Non-Visible Links are :"+ (indexvalue-count));
		
	}

}
