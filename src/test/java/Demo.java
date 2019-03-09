import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Demo {

    WebDriver driver=null;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/dongshichao/chromedriver/chromedriver2.46");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

    }

    @Test
    public void test() throws Exception{
        driver.get("https://testerhome.com");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        By shequ = By.linkText("社区");
        driver.findElement(shequ).click();

        By search =By.name("q");
        driver.findElement(search).sendKeys("app");
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2);

        System.out.println(111);



    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }

}
