package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class PageBase {
    AndroidDriver driver;
    WebDriverWait wait;
    public static final short WAIT = 10;

    public PageBase(AndroidDriver driver){
        this.driver = driver;
        //PageFactory.initElements(driver,this);
    }

    public void waitForVisibility(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement findByXpath(String element){
        waitForVisibility();
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        AppiumBy.xpath(element)));
    }
}
