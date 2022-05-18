import org.junit.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.*;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

class LogoutPage extends PageBase {
	private By exitButton = By.xpath("//a[@class='ygNhD2Eu6vTcRkmpThnZ _ZkTx_R7ifHnNRINAerg QRV_s31csZJe6IANA1Wt b4pHQc7IMZLAm_ugYht3 Uf1MKh1Q3O1Uzwrqh6Oy Yx8izD25pNAoNG8f4x5s hMiAmnd8_2LxqhtwE6su _pLSoeS2RcFZJ80Juxld']");
	
	public LogoutPage(WebDriver driver){
		super(driver);
	}
	
	public void logOut(){
		this.waitAndReturnElement(exitButton).click();
	}

}
