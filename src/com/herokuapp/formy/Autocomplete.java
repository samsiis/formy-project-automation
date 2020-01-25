package com.herokuapp.formy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class Autocomplete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		
		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		autocomplete.sendKeys("1555 Peachtree Street Northeast");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		
		//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		WebDriverWait wait =  new WebDriverWait(driver,10);

		WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pac-item")));
		
		autocompleteResult.click();
		
				
	}

}
