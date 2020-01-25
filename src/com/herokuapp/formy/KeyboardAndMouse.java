package com.herokuapp.formy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class KeyboardAndMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/keypress");
		WebElement name = driver.findElement(By.id("name"));
		name.click();
		name.sendKeys("Samuel");
		WebElement button  = driver.findElement(By.id("button"));
		button.click();
				
		
		//driver.quit();
		
	}

}
