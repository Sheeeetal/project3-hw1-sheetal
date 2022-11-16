package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxBrowserTest {
    public static void main(String[] args) {
        String baseUrl=("http://the-internet.herokuapp.com/login");
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driverFbt=new FirefoxDriver();
        driverFbt.get(baseUrl);
        driverFbt.manage().window().maximize();
        driverFbt.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get and print title page in console
        String title= driverFbt.getTitle();
        System.out.println("page title is:"+title);
        //get current url
        System.out.println(("Current URL:"+ driverFbt.getCurrentUrl()));
        //get page source
        System.out.println("Page source:"+ driverFbt.getPageSource());
        //getting and entering email in email field
        WebElement emailField=driverFbt.findElement(By.id("Email"));
        emailField.sendKeys("sp@gmail.com");
        //getting and entering password in password field
        WebElement passwoedField =driverFbt.findElement(By.id("Password"));
        passwoedField.sendKeys("pass_234");

        // Closing the chrome browser
        driverFbt.quit();


    }
}
