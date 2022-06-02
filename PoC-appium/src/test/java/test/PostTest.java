package test;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import pages.FeedPage;

import java.net.URL;

public class PostTest {
    public static void run(AndroidDriver driver){
        publish(driver);
        //likePost(driver);
        findMyPost(driver);
    }

    @Test
    public static void publish(AndroidDriver driver){
        FeedPage feedPage = new FeedPage(driver);
        feedPage.type("Este es mi primer post en Taringa");
        feedPage.publish();
    }

    @Test
    public static void likePost(AndroidDriver driver){
        FeedPage feedPage = new FeedPage(driver);
        feedPage.likePost();
    }

    @Test
    public static void findMyPost(AndroidDriver driver){
        FeedPage feedPage = new FeedPage(driver);
        feedPage.findPost();
    }


}
