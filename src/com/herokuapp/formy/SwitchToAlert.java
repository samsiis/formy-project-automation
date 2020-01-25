package com.herokuapp.formy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class SwitchToAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://formy-project.herokuapp.com/switch-window");
		
		WebElement newAlertButton = driver.findElement(By.id("alert-button"));
		
		newAlertButton.click();
		
		Alert alert  = driver.switchTo().alert();
		alert.accept();
			
		
	}

}
