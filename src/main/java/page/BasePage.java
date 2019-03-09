package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;
    public BasePage(WebDriver driver){
        this.driver=driver;
        wait= new WebDriverWait(driver,5);
    }
    public void waitVisibility(By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));

    }
    public void click(By elementBy){
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }
    public void writeText(By elementBy,String text){
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }
    public void switchwindow(String title){
        for (String handle:driver.getWindowHandles()){
            driver.switchTo().window(handle);
            if (driver.getTitle().contains(title)){
                break;
            }
        }

    }

}
