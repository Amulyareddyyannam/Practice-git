package com.org.ec1.practice;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	@Test
	public void TestNavigation() {
		
    WebDriver driver = new ChromeDriver();
	    
        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
        
        driver.manage().window().maximize();
        
        System.out.println("Navigation is done");
        
        driver.quit();
        
        
        
      
       

	}

}
