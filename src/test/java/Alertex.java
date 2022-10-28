import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertex {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		// Using Alert options 
		 driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		 
		Alert ale = driver.switchTo().alert();
		
		//now using the ok button using accept method
		
		ale.accept();	
		
		String  pattern = "YYYY-mm-dd HH-mm-ss";
		
		Date date = new Date();
		
		SimpleDateFormat  dateformate = new SimpleDateFormat(pattern);
		
		String currentdate = dateformate.format(date);
		
		String actualdate = currentdate.replace(":",";");
		
		String path = "C:\\Users\\rajna\\git\\selenium-project-automation-practise1";
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File des = new File(path+actualdate+".png");
		
		FileUtils.copyFile(src, des);
		
		

	}

}
