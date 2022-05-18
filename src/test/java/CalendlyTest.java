import org.junit.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import java.util.*;

public class CalendlyTest {
	public WebDriver driver;
	
	@Before
	public void setup(){
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void testSearch(){
		MainPage mainPage = new MainPage(this.driver);
		LoginPage loginPage = mainPage.openLogin();
		PasswordPage passwordPage = loginPage.login("alikoshamkirli57@gmail.com");
		HomePage homePage = passwordPage.next("Aliko_57");
		
		System.out.println(homePage.getUserInfo());
		Assert.assertTrue(homePage.getUserInfo().contains("Aliko"));
		
		LogoutPage logoutPage = homePage.logOut();
	}
	
    @After
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }
	
}





