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

public class MainPage extends PageBase {
	private By loginMenuButton = By.xpath("//a[@href='/login']");  //By.className("sc-1i84b6l-0 huPBCk");
	
	public MainPage(WebDriver driver){
		super(driver);
		this.driver.get("https://calendly.com/");
	}

	public LoginPage openLogin(){
		this.waitAndReturnElement(loginMenuButton).click();
		return new LoginPage(this.driver);
	}

}
