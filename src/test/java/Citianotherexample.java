import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Citianotherexample {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		//Sync
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Step1: Open Browser
		driver.get(" https://www.citi.com/");
		
		//Step2: Click on Creditcard on footer Section
		
		driver.findElement(By.xpath("(//div[@class='flex-wrapper wrapper-text'])[1]")).click();

		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("(//*[@class='btn btn-primary default learn-more-btn noMargin'])[1]")).click();
		
		
		
		
		//Step3: Get the window id
		
		Set<String> Windowid = driver.getWindowHandles();
		
		System.out.println(Windowid);
		
		List<String> Windowlist = new ArrayList<String>(Windowid);
		
		String mainwindow = Windowlist.get(0);
		String newwindow = Windowlist.get(1);
		
		System.out.println(mainwindow);
		System.out.println(newwindow);
		
		
		//Step4: SwitchTO new window
		
		driver.switchTo().window(newwindow);
		
		//Step5: get the URL of Newwindow
		
		String URL = driver.getCurrentUrl();
		
		System.out.println("The Newwindow of URL is :" + URL);
		
		driver.close();
		driver.switchTo().window(mainwindow);
		
		driver.close();
		
		
		

	}

}
