package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
    static WebDriver driver=new FirefoxDriver();
    static WebDriverWait wait=new WebDriverWait(driver,10);

}
