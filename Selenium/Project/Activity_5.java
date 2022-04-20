package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity_5 {
    WebDriver driver;
    WebDriverWait wait;
    WebElement element;
    @BeforeTest
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");

    }
    @Test
    public void EditInfo_test() throws InterruptedException
    {

        driver.manage().window().maximize();
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).clear();
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        driver.findElement(By.id("btnSave")).click();
        driver.findElement(By.id("personal_txtEmpFirstName")).clear();
        driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("Ram");
        driver.findElement(By.id("personal_txtEmpLastName")).clear();
        driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("Charan");
        driver.findElement(By.id("personal_optGender_1")).click();
        driver.findElement(By.id("personal_cmbNation")).click();
        new Select(driver.findElement(By.id("personal_cmbNation"))).selectByVisibleText("Icelander");
        driver.findElement(By.xpath("//option[@value='81']")).click();
        driver.findElement(By.id("btnSave")).click();

    }
    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
