package com.webDemoShop.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {

	WebDriver driver;

	public WebDriverUtils(WebDriver driver) {
		this.driver=driver;
	}
	public void click(By prop) {
	//	new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.visibilityOfElementLocated(prop));
		driver.findElement(prop).click();
	}
	public void enterText(By prop,String value) {
		new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.visibilityOfElementLocated(prop));
		clearValueFromTextBox(prop);
		driver.findElement(prop).sendKeys(value);
	}

	public void clearValueFromTextBox(By prop) {
		new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.visibilityOfElementLocated(prop));
		driver.findElement(prop).clear();
	}
	public void selectValueFromDropDown(By prop,String value) {
		new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.visibilityOfElementLocated(prop));
		new Select(driver.findElement(prop)).selectByValue(value);
	}

	public void selectValueFromDropDown(By prop,int index) {
		new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.visibilityOfElementLocated(prop));
		new Select(driver.findElement(prop)).selectByIndex(index);
	}
	
	public String getText(By prop) {
		new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.visibilityOfElementLocated(prop));
		return driver.findElement(prop).getText().trim();
	}
	public void mouseOver(By prop) {
		new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.visibilityOfElementLocated(prop));
		new Actions(driver).moveToElement(driver.findElement(prop)).build().perform();
	}
	public void getText(By prop,String tagName) {
		new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.visibilityOfElementLocated(prop));
		driver.findElement(prop).getAttribute(tagName);
	}
	public boolean isDisplayed(By prop) {
		new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.visibilityOfElementLocated(prop));
		return driver.findElement(prop).isDisplayed();
	}

}
