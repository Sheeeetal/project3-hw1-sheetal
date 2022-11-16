package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl ="http://the-internet.herokuapp.com/login";
System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driverCbt = new ChromeDriver();
//launce url
        driverCbt.get(baseUrl);
        //maximise window
        driverCbt.manage().window().maximize();
        //time given to driver to wait until page is loaded completely
        driverCbt.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get and print title page in console
        String title= driverCbt.getTitle();
        System.out.println("page title is:"+title);
        //get current url
        System.out.println(("Current URL:"+ driverCbt.getCurrentUrl()));
        //get page source
        System.out.println("Page source:"+ driverCbt.getPageSource());
        //getting and entering email in email field
        WebElement emailField=driverCbt.findElement(By.id("Email"));
        emailField.sendKeys("spsp@gmail.com");
        //getting and entering password in password field
        WebElement passwordField =driverCbt.findElement(By.id("Password"));
        passwordField.sendKeys("pass_11234");

        // Closing the chrome browser
        driverCbt.quit();


    }
}
