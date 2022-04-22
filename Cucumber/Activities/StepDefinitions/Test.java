package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Test extends Baseclass{
    @Given("^user is on TS homepage$")
    public void openTSHomePage()
    {
        driver.get("https://trainning-support-net");

    }
    @When("^user clicks on about us button$")
    public void ClickAboutUsButton()
    {
     driver.findElement(By.id("about-link")).click();
    }
    @Then("^user is directed to about us page$")
    public void aboutusverification()
    {
        String AboutusPageTitle=driver.findElement(By.xpath("h1[@class='ui header']")).getText();
        Assert.assertEquals("About Us",AboutusPageTitle);
    }
}
