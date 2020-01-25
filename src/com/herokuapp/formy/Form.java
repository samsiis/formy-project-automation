package com.herokuapp.formy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class Form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/form");
		
		new FormPage();
		
		FormPage.submitForm(driver);
		
		new ConfirmationPage();
		
		ConfirmationPage.waitForAlertBanner(driver);
	
		assertEquals("The form was successfully submitted!",ConfirmationPage.getAlertBannerText(driver));
		
		
	}

	
	

}
