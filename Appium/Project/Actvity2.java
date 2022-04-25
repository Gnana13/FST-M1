package liveProject;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity2 {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;
    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","android");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("deviceId","emulator-5554");
        caps.setCapability("appPackage","com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);

        URL appserver = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appserver,caps);
        wait = new WebDriverWait(driver, 20);
    }
    @Test
    public void notesmethod(){
        driver.findElementById("com.google.android.keep:id/notes").click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.keep:id/notes")));
        driver.findElementById("com.google.android.keep:id/editable_title").sendKeys("Test1");
        driver.findElementById("com.google.android.keep:id/edit_note_text").sendKeys("Example for Test");
        driver.findElementByAccessibilityId("Open navigation drawer").click();
        String text = driver.findElementById("com.google.android.keep:id/index_note_text_description").getText();
        Assert.assertEquals(text,"Example for Test");
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}