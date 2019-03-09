package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private static WebDriver driver=null;

    public static void start(){
        System.setProperty("webdriver.chrome.driver", "/Users/dongshichao/chromedriver/chromedriver2.46");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testerhome.com");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }


}
