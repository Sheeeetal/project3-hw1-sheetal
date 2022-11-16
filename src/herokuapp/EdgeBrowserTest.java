package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {
    //creating main method of the class
    public static void main(String[] args) {
        // declaring string type local variable
        String baseUrl = "http://the-internet.herokuapp.com/login";
        // setting chrome browser
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        //initialising interface object
        WebDriver driverEbt = new EdgeDriver();
//opening url in chrome
        driverEbt.get(baseUrl);
        //maximising window upon opening
        driverEbt.manage().window().maximize();
        //time given to driver to wait until page is loaded completely
        driverEbt.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get and print title page in console
        String title= driverEbt.getTitle();
        System.out.println("page title is:"+title);
        //get current url
        System.out.println(("Current URL:"+ driverEbt.getCurrentUrl()));
        //get page source
        System.out.println("Page source:"+ driverEbt.getPageSource());
        //getting and entering email in email field
        WebElement emailField=driverEbt.findElement(By.id("Email"));
        emailField.sendKeys("spsp@gmail.com");
        //getting and entering password in password field
        WebElement passwordField =driverEbt.findElement(By.id("Password"));
        passwordField.sendKeys("1234Pass");

        // Closing the chrome browser
        driverEbt.quit();


    }


}

