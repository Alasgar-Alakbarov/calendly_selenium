import org.junit.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.*;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

class PasswordPage extends PageBase {
	private By passwordInputBox = By.id("password"); // By.xpath("//input[@id='password']");
	private By nextButton = By.xpath("//input[@type='submit']");
	//private By nextButton = By.xpath("//input[@class='button js-loading-hide']");		
	
	public PasswordPage(WebDriver driver){
		super(driver);
	}
	
	public HomePage next(String password){
		this.waitAndReturnElement(passwordInputBox).sendKeys(password);
		this.waitAndReturnElement(nextButton).click();
		return new HomePage(this.driver);
	}

}
