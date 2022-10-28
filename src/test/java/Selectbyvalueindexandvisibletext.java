import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectbyvalueindexandvisibletext {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.browserstack.com/");
		
		/*WebElement developers_dropdown = driver.findElement(By.id("developers-menu-toggle"));
		Select objSelect = new Select(developers_dropdown);
		objSelect.selectByIndex(2)*/
		
		/*driver.get("https://www.browserstack.com/");
		WebElement solutions_dropdown = driver.findElement(By.id("solutions-menu-dropdown"));
		Select solutions = new Select(solutions_dropdown);
		solutions.selectByValue("4000");*/
	
		/*WebElement solutions_d = driver.findElement(By.xpath("(//*[@role='presentation'])[1]"));
		Select s1 = new Select(solutions_d);
		s1.selectByVisibleText("Live");*/
		
		Actions act = new Actions(driver);
		
		//WebElement idnew = driver.findElement(By.xpath("(//*[@role='presentation'])[2]"));
		
		WebElement idnew = driver.findElement(By.xpath("(//*[@id='product-menu-toggle'])[1]"));
		 
		act.moveToElement(idnew).perform();
		
		//driver.findElement(By.linkText("Support")).click();
		
		WebElement appLive=driver.findElement(By.xpath("//*[@class='product-cards-wrapper--click--hoverclick product-card-live']"));
		
		//WebElement appLive =driver.findElement(By.linkText("App Live"));
		
		act.moveToElement(appLive);
		
		act.click().perform();
		
		
		
		
		

	}

}
