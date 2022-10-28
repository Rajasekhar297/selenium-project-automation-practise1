import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SofwaretestingGuru {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Step 1: Open Browser through Link
		driver.get("http://softwaretesting-guru.blogspot.com/p/blog-page.html");
		
		//Step 2:enter the text field using sendKeys (Fill the Form)
		
       driver.findElement(By.name("Name")).sendKeys("Welcome");
       
       //Step 3:Uncheck the Checkbox using the click method(Handle)
		
		driver.findElement(By.name("subscribe")).click();
		
		//Step 4: enter the Comments using the Sendkeys method (Comments)
		driver.findElement(By.name("comments")).sendKeys("Welcome to the Software Testing");
		
		//Step 5: Now by Using the Select Option method 
		//a. First we need to give data type method (WebElement) in Selenium and here we will assign Object identification method will use
		
		WebElement country = driver.findElement(By.name("countries"));
		
		Select newcountry = new Select(country);
		
		newcountry.selectByVisibleText("Argentina");
		
		//Step 6: select Multiple select option
		
		WebElement name = driver.findElement(By.name("computerbrands"));
		Select companyname = new Select(name);
		
		companyname.selectByVisibleText("IBM");
		companyname.selectByVisibleText("Compaq");
		companyname.selectByVisibleText("Sony");
		companyname.deselectByVisibleText("DELL");
		
		//Step 7: Passwordfield using sendKeys
		driver.findElement(By.name("pwd")).sendKeys("Kosmic@123");
		//Step 8 :Radio button using the click() method& xpath;
		

		driver.findElement(By.xpath("//input[@value='excellent']")).click();
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		
		Alert ale = driver.switchTo().alert();
		
		ale.accept();
		
		
		
		
		
		
		
		
		
		
		
	}

}
