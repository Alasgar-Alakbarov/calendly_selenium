import org.junit.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.*;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
//import java.utill.*;

class LoginPage extends PageBase {
	private By nameInputBox = By.xpath("//input[@name='email']"); // By.name("email");
	private By loginButton = By.xpath("//button[@type='submit']");
	
	public LoginPage(WebDriver driver){
		super(driver);
	}
	
	public PasswordPage login(String username){
		//driver.refresh(); 
		this.waitAndReturnElement(nameInputBox).sendKeys(username);
 		this.waitAndReturnElement(loginButton).click();
		return new PasswordPage(this.driver);
	}

}
