package test.java.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage {

	public void verifySubmit(WebDriver driver, WebDriverWait wait) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".alert.alert-success")));
		if(driver.findElement(By.cssSelector(".alert.alert-success")).getText().equals("The form was successfully submitted!")) 
			System.out.println("Success");
	}
}
