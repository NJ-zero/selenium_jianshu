package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){
        super(driver);
    }

    By phone=By.id("session_email_or_mobile_number");
    By password=By.id("session_password");
    By loginbutton=By.id("sign-in-form-submit-btn");
    public MainPage loginpass(String number,String pwd){
        writeText(phone,number);
        writeText(password,pwd);
        driver.findElement(loginbutton).click();
        return new MainPage(driver);
    }
}
