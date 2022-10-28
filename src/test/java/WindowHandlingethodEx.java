import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingethodEx {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		//Sync
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Step1: Open the link of Citi Bank
		driver.get("https://www.citi.com/credit-cards/compare/view-all-credit-cards");

		//Step2: click on any link using the linktext operator
		driver.findElement(By.linkText("Security")).click();
		
		//Step3: Get windows Id
		Set<String> windowid = driver.getWindowHandles();
		
		System.out.println(windowid);
		List<String> windowlist = new ArrayList<String>(windowid);
		
		String mainwindow = windowlist.get(0);
		String newwindow = windowlist.get(1);
		
		System.out.println(mainwindow);
		System.out.println(newwindow);
		
		//Step4:SwitchTo new window
		
		driver.switchTo().window(newwindow);
		
		//Step5 : get the url of new window
		
		String URL = driver.getCurrentUrl();
		
		System.out.println("The New Window Citi Bank URL is :" + URL);
		
		//Step6 : CLose the main window
		
		driver.switchTo().window(mainwindow);
		
		driver.close();
		
		
		
		
		
	}

}
