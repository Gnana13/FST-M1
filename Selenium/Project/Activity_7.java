package LiveProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity_7 {
        WebDriver driver;
        WebDriverWait wait;
        WebElement element;
        @BeforeTest
        public void setup() {
            driver = new FirefoxDriver();
            driver.get("http://alchemy.hguy.co/orangehrm");

        }
        @Test
        public  void testMethod() throws InterruptedException {
            driver.findElement(By.id("txtUsername")).sendKeys("orange");
            driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
            driver.findElement(By.id("btnLogin")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("menu_pim_viewMyDetails")).click();
            driver.findElement(By.linkText("Qualifications")).click();
            driver.findElement(By.id("addWorkExperience")).click();
            driver.findElement(By.id("experience_employer")).sendKeys("IBM");
            driver.findElement(By.id("experience_jobtitle")).sendKeys("Tester");
            driver.findElement(By.id("experience_from_date")).clear();
            driver.findElement(By.id("experience_from_date")).sendKeys("2012-05-29");
            driver.findElement(By.id("btnWorkExpSave")).click();
        }
        @AfterTest
        public void tearDown(){
            driver.close();
        }
    }

