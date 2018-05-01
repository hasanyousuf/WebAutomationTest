package uk.co.rightmove.WebAutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SalesTest extends Sales {

	//@Test
	public void Find(){
		WebDriver	driver = new FirefoxDriver();
		driver.get(URL);
		WebElement searchLocation = driver.findElement(By.xpath(".//*[@id='searchLocation']"));
		searchLocation.sendKeys(searchText);
		WebElement searchButtonSale= driver.findElement(By.xpath(".//*[@id='buy']"));
		searchButtonSale.click();
		driver.close();
	}
}
