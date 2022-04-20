package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class Activity_2 {
    WebDriver driver;
    WebDriverWait wait;
    WebElement element;
    @BeforeTest
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");

    }
    @Test
    public void Header_test ()
    {

        driver.manage().window().maximize();

        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).clear();
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
       //WebElement element=driver.findElement(By.xpath("//img[@href="http://www.orangehrm.com/"]"));
        //WebElement element=driver.findElement(By.tagName("href"));
       WebElement element=driver.findElement(By.partialLinkText("OrangeHRM"));
        System.out.println("url is "+element.getAttribute("href"));
        //driver.close();

    }
    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
