package liveProject;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Activity3 {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;
    static int i = 2;
    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","android");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("deviceId","emulator-5554");
        caps.setCapability("appPackage","com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);

        URL appserver = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appserver,caps);
        wait = new WebDriverWait(driver, 20);
    }
    @Test
    public void googlechrome() {
        driver.get("https://www.training-support.net/selenium");
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View")));
       // driver.findElement(
        //                MobileBy.AndroidUIAutomator(UiScrollable + ".scrollForward(7).scrollIntoView(text(\"To-Do List\"))"))
         //       .click();
        driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector()).scrollTextIntoView(\"To-Do List\")"));
        driver.findElementById("taskInput").sendKeys("Add tasks to list");
        driver.findElementByClassName("Add tasks to list").click();
        driver.findElementById("taskInput").sendKeys("Get number of tasks");
        driver.findElementByClassName("Add tasks to list").click();
        driver.findElementById("taskInput").sendKeys("Clear the list");
        driver.findElementByClassName("Add tasks to list").click();
        List<MobileElement> addedTasks = driver.findElementsByClassName("android.view.View");

        for (MobileElement addedTask : addedTasks) {

            addedTask.click();
            i--;

        }
        driver.findElementByLinkText("Clear List").click();
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}