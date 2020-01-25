package com.herokuapp.formy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://formy-project.herokuapp.com/datepicker");
		
		WebElement datefield = driver.findElement(By.id("datepicker"));
		datefield.sendKeys("03/03/2020");
		
		datefield.sendKeys(Keys.RETURN);
		
		
		
				
		
		
	}

}
