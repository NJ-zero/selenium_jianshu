import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.MainPage;

import java.security.PublicKey;

public class SearchTest {
    WebDriver driver=null;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/dongshichao/chromedriver/chromedriver2.46");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void test_search() throws Exception{
        driver.get("https://www.jianshu.com/");
        MainPage mainPage=new MainPage(driver);
        mainPage.gosearchres("迈阿密小白");
        Thread.sleep(5);
        Assert.assertTrue(driver.getPageSource().contains("迈阿密小白"));
        driver.close();
    }
//
//    @AfterMethod
//    public void teardown(){
//        driver.quit();
//    }


}
