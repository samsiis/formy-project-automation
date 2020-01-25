package com.herokuapp.formy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class ExecuteJavaScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://formy-project.herokuapp.com/modal");
		
		WebElement modalButton = driver.findElement(By.id("modal-button"));
		
		modalButton.click();
		
		WebElement closeButton = driver.findElement(By.id("close-button"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		
		
		js.executeScript("arguments[0].click();", closeButton);

		

	}

}
