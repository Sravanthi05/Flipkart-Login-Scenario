package Flip1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginScenario {
	String driverpath = "/Users/sravanthi/Downloads/chromedriver";
	WebDriver driver;
	String baseurl = "https://www.flipkart.com/";
	

	
  @Test(dataProvider="loginScenario")
  public void flipcartlogin(String Scenario, String username, String password) {
	  System.setProperty("webdriver.chrome.driver", driverpath);
	  driver = new ChromeDriver();
	  driver.get(baseurl);
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
	  
	  driver.findElement(By.xpath("//form/div/input[@type='text']")).sendKeys(username);
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	  driver.findElement(By.xpath("//button[contains(@class,'_3AWRsL')]")).click();
	  
	 if (Scenario.equalsIgnoreCase("valid")) {
		 
		  System.out.println("Login Successful");
	  }
	  else if (Scenario.equalsIgnoreCase("invaliduser")) {
		  String invalid= driver.findElement(By.xpath("//span[@class='_2YULOR']")).getText();
		  System.out.println(invalid);
	  }
	  else {
		  String invalid= driver.findElement(By.xpath("//span[@class='_2YULOR']")).getText();
		  System.out.println(invalid);
	  }
	  driver.quit();
  }
  
  
  @DataProvider(name = "loginScenario")
  public Object[][] getData(){
	  return new Object[][] {
		  {"valid","sravanthi.mgs@gmail.com","abcd"},
		  {"invaliduser","sravanthi@gmail.com","abcd"},
		  {"invalidpw","sravanthi.mgs@gmail.com","asfd"}
	  };
	  
  }
  
  
  
}



