import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verifytitle {

	public static void main(String[] args) {
		
		
WebDriverManager.chromedriver().setup();

ChromeDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

// Open URL or Browser
driver.get("https://www.google.com/");


// Find Element and SendKeys and Submit

WebElement Enter = driver.findElement(By.name("q"));

Enter.sendKeys("Iphone14");

Enter.submit();

// Verify Page Title after GoogleSearch

String ExpectedTitle = "Iphone14 - Google Search";
String ActualTitle = driver.getTitle();

System.out.println(ExpectedTitle);

System.out.println(ActualTitle);

if(ExpectedTitle.equals(ActualTitle)) {
	
	System.out.println("The Entered value is Matches");
	
		
	
	
}else {
	
	System.out.println("The Enter value is Doesnot Matches");
	
	
}
// verify that GetCurrentUrl 

String expectedurl = "https://www.google.com/search?q=Iphone14";

String actualurl = driver.getCurrentUrl();

System.out.println(expectedurl);
System.out.println(actualurl);

if(actualurl.contains(expectedurl)) {
	System.out.println("The Entered Url is Matches");
	
}else {
	System.out.println("The Enterd Url is Doesn't Match");
}
	
	

driver.close();





}
	
}




		
		

	


