package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity_1 {
   // WebDriver driver;
   WebDriver driver;
    WebDriverWait wait;
    WebElement element;
    @BeforeTest
    public void setup() {
        driver = new FirefoxDriver();

    }
    @Test
    public void TestTitle ()
    {
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        String expectedTitle="OrangeHRM";
        Assert.assertEquals(title,expectedTitle);
        driver.close();

    }
    @AfterTest
    public void tearDown(){
        driver.close();
    }


}
