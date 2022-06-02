package test;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import pages.LoginPage;

public class LoginTest {

    public static void run(AndroidDriver driver){
        loginTest(driver);
    }

    @Test
    public static void loginTest(AndroidDriver driver){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("David");
        loginPage.setPassword("12345");
        loginPage.clickLogin();
    }
}
