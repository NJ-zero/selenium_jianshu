package page;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage{

    public  MainPage (WebDriver driver){
        super(driver);
    }

    By search = By.id("q");
    public SearchResPage gosearchres(String key){
        writeText(search,key);
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();

        String mainhandle=driver.getWindowHandle();
        //等待窗口为两个后切换窗口
        WebDriverWait wait=new WebDriverWait(driver,5000);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        for (String handle:driver.getWindowHandles()){
            if(!handle.equalsIgnoreCase(mainhandle)){
                driver.switchTo().window(handle);
            }
        }

        return new SearchResPage(driver);

    }
    By login =By.id("sign_in");
    public LoginPage gotoLogin(){
        driver.findElement(login).click();
        return new LoginPage(driver);
    }

}
