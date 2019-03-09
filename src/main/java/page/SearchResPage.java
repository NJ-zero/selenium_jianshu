package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchResPage extends BasePage {

    public  SearchResPage (WebDriver driver){
        super(driver);
    }

    By res=By.xpath("//div[@class='result']");
    public ArrayList<String> getall(){
        ArrayList<String> array = new ArrayList<String>();
        for(WebElement e:driver.findElements(res)){
            array.add(e.getText());
        }
        return array;

    }
}
