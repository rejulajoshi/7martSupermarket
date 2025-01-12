package Utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtilities {
//all waits 
	public static int implicitwait=10;
	public static int explicitwait=10;
	public static int fluentwait=2;
	public void fluentWaitElements(WebDriver driver, WebElement element, String attribute, String attributeValue,
			int total) {
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(fluentwait))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.attributeContains(element, attribute, attributeValue));
	}
	public void waitForWebElementAlert(WebDriver driver) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(explicitwait));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public void waitUntilElementIsVisible(WebDriver driver, WebElement element)
	{ WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	
	wait.until(ExpectedConditions.visibilityOf(element));
	
	
	}
	public void waitForWebElementToBeClickable(WebDriver driver,WebElement element) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(explicitwait));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void waitUntilElement(WebDriver driver, WebElement element)
	{ WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(explicitwait));
	
	wait.until(ExpectedConditions.textToBePresentInElement(element, "hello"));
	
	}
	public void waitUntilTextShows(WebDriver driver,WebElement element,String value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(explicitwait));
		wait.until(ExpectedConditions.textToBePresentInElement(element, value));
	}
	public void waitForWebElementTitle(WebDriver driver,WebElement element,String attribute,String value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(explicitwait));
		wait.until(ExpectedConditions.titleIs(value));
	}
	public void implicitylyWait(WebDriver driver) {
		
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitwait));
	}
}
