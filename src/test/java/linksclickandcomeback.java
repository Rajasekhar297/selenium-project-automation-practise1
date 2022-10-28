import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linksclickandcomeback {
public static void main(String[] args) {
WebDriverManager.chromedriver().setup();

ChromeDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

driver.get("https://www.google.com/");
	
List<WebElement> links = driver.findElements(By.tagName("a"));

int indexvalue = links.size();

System.out.println(indexvalue);

for(int i=0;i<indexvalue;i++) {
	if(!links.get(i).getText().isEmpty()) {
		
		System.out.println(links.get(i).getText());
		links.get(i).click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		links= driver.findElements(By.tagName("a"));
		
		
	}
	
	
	
}driver.quit();

	
	
	
	
	
	
	
	
	
	
	
	
}
}
