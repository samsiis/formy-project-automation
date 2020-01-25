package com.herokuapp.formy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class SwitchToActiveWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://formy-project.herokuapp.com/switch-window");
		
		WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
		
		newTabButton.click();
		
		String originalHandle = driver.getWindowHandle();
		
		for(String handle1: driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
		}
			
			
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.switchTo().window(originalHandle);
			
					
		
		
	}

}
