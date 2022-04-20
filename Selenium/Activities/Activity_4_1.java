package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_1  {



    public static void main(String[] args) {

        //Create a new instance of the Firefox driver

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");

        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        driver.findElement(By.xpath("/html/body/div/div/div/a")).click();

        System.out.println("Heading is: " + driver.getTitle());


        driver.close();

    }
}