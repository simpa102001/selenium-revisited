package test.java.testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.java.resources.ConfirmationPage;
import test.java.resources.FormPage;

public class SeleniumTest {
	
	
	
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","/Users/simpa/Downloads/chromedriver");
		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		FormPage page = new FormPage();
		page.submitForm(driver, wait);
		
		ConfirmationPage confirm = new ConfirmationPage();
		confirm.verifySubmit(driver, wait);
	}
	
	
}
