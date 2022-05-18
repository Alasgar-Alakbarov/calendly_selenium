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

public class HomePage extends PageBase {
	private By enfCont = By.xpath("//div[@class='js-enforcement-content']");
	private By userToggle = By.xpath("//div[@class='main-user-menu-toggle']");

	public HomePage(WebDriver driver){
		super(driver);
	}

	public String getUserInfo(){
		return this.waitAndReturnElement(enfCont).getText();
	}
	public LogoutPage logOut(){
		 this.waitAndReturnElement(userToggle).click();
		return new LogoutPage(this.driver);
	
	}
	
}
