package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    //Declaring static variable of static type to store browser name
    static String browser ="Edge";
    //Declaring static variable of string type to store target url
    static String baseUrl="http://the-internet.herokuapp.com/login";
    //initialising static variable of webdriver type to store web drive value
    static WebDriver driveMulti;
    //main method
    public static void main(String[] args) {
    if (browser.equalsIgnoreCase("Chrome")) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driveMulti = new ChromeDriver();

    } else if (browser.equalsIgnoreCase("Firefox")) {
        System.setProperty("webdriver.gheko.driver", "drivers/geckodriver.exe");
        driveMulti = new FirefoxDriver();


    } else if (browser.equalsIgnoreCase("edge")) {
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        driveMulti = new EdgeDriver();
    } else {
        System.out.println("Wrong browser name");
    }

    driveMulti.get(baseUrl);
    // Maximise windows
    driveMulti.manage().window().maximize();

    // Time implicit
    driveMulti.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


    // Get the title of the page
    String title = driveMulti.getTitle();
    System.out.println("Page title is :" + title);


    // get current URL
    System.out.println("Current URl :" + driveMulti.getCurrentUrl());

    // Get page source
    System.out.println("Page source : " + driveMulti.getPageSource());

    // Nevigate to login page
//        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
//        driver.navigate().to(loginUrl);

    // Navigate to log in page by clicking on log in link
    // WebElement loginLink = driver.findElement(By.linkText("Log in"));
    //loginLink.click();

    // find the email field element
    // driver.findElement(By.id());
    WebElement emailField = driveMulti.findElement(By.name("username"));
    emailField.sendKeys("tomsmith");

    // Find the password field element
    //  driver.findElement(By.name(""));
    WebElement passwordField = driveMulti.findElement(By.name("password"));
    passwordField.sendKeys("SuperSecretPassword!");

    // Close the browser automatically
    // driver.close();
    //  driver.quit();
    // driver.get("");


}
}
