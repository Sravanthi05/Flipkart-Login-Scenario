package Flip1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Addtocart {
	String driverpath = "/Users/sravanthi/Downloads/chromedriver";
	WebDriver driver;
	String baseurl = "https://www.flipkart.com/";
	
	@Test
	public void iphone() throws Throwable {
	System.setProperty("webdriver.chrome.driver", driverpath);
	  driver = new ChromeDriver();
	  driver.get(baseurl);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
	  
	  driver.findElement(By.xpath("//form/div/input[@type='text']")).sendKeys("sravanthi.mgs@gmail.com");
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcd");
	  driver.findElement(By.xpath("//button[contains(@class,'_3AWRsL')]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone");
	  driver.findElement(By.xpath( "//button[@class='L0Z3Pu']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//img[contains(@alt,'APPLE iPhone 13 5G (Midnight, 128 GB')]")).click();
	  
	  Set<String> window = driver.getWindowHandles();
	  Iterator<String> win = window.iterator();
	  String main = win.next();
	  String child = win.next();
	  
	  driver.switchTo().window(child);
	  
	  driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l')][1]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//button[contains(@class,'_3AWRsL')]")).click();	
	  
	  
	

	/*  WebDriverWait wait = new WebDriverWait(driver,50);
	  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='_1XFPmK'])[1]")));
	  
	  driver.findElement(By.xpath("(//div[@class='_1XFPmK'])[1]")).click();
	  driver.findElement(By.xpath("//button[contains(@class,'RLM7ES')]")).click();*/
	  
	  
	  
	  
}
}
