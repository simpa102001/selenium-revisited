package test.java.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormPage {

public void submitForm(WebDriver driver, WebDriverWait wait) {
		
		driver.get("https://formy-project.herokuapp.com/form");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#first-name")));
		driver.findElement(By.cssSelector("#first-name")).sendKeys("Emmanuel");
		driver.findElement(By.cssSelector("#last-name")).sendKeys("Moses");
		driver.findElement(By.cssSelector("#job-title")).sendKeys("QA Analyst");
		driver.findElement(By.cssSelector("#radio-button-2")).click();
		driver.findElement(By.cssSelector("#checkbox-3")).click();
		driver.findElement(By.cssSelector("#select-menu option:nth-child(1)")).click();
		WebElement datePicker = driver.findElement(By.cssSelector("#datepicker"));
		datePicker.sendKeys("05/26/2021");
		datePicker.sendKeys(Keys.RETURN);
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
	}

}
