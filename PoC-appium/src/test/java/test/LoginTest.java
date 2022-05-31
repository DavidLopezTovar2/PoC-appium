package test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginTest {
    @Test
    public static void run(AndroidDriver driver){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("David");
        loginPage.setPassword("12345");
    }
}
