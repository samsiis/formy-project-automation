package com.herokuapp.formy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://formy-project.herokuapp.com/dropdown");
		
		WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
		
		dropDownMenu.click();
		
		WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
		
		autocompleteItem.click();
		
		
		
		
				
		
		
	}

}
