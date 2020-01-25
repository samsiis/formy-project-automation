package com.herokuapp.formy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {

public static void submitForm(WebDriver driver) {
		
		WebElement firstName = driver.findElement(By.id("first-name"));
		firstName.sendKeys("Samuel");
		
		WebElement lastName = driver.findElement(By.id("last-name"));
		lastName.sendKeys("Sopeju");
		
		WebElement jobTitle = driver.findElement(By.id("job-title"));
		jobTitle.sendKeys("Software Engineer");
		
		WebElement education = driver.findElement(By.id("radio-button-3"));
		education.click();
		
		WebElement sex = driver.findElement(By.cssSelector("input[value='checkbox-3']"));
		sex.click();
		
		WebElement experienceMenu = driver.findElement(By.id("select-menu"));
		experienceMenu.click();
		
		WebElement experienceYears = driver.findElement(By.cssSelector("option[value='2']"));
		experienceYears.click();
		
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.sendKeys("03/03/2020");
		datepicker.sendKeys(Keys.RETURN);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
		submitButton.click();
	}
}
