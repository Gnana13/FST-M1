package activities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity1 {
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","android");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("deviceId","emulator-5554");
        caps.setCapability("appPackage","com.android.calculator2");
        caps.setCapability("appActivity", ".Calculator");
        caps.setCapability("noReset", true);

        URL appserver = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appserver,caps);
    }
    @Test
    public void add() {
        driver.findElementById("digit_5").click();
        // Using Accessibility ID
        driver.findElementByAccessibilityId("multiply").click();
        // Using XPath
        driver.findElementByXPath("//android.widget.Button[@text='9']").click();

        // Perform Calculation
        driver.findElementById("eq").click();

        // Display Result
        String result = driver.findElementById("result").getText();
        System.out.println(result);

        // Assertion
        Assert.assertEquals(result, "45");
    }

    @AfterClass
    public void tearDown() {
        // Close app
        driver.quit();
    }
}