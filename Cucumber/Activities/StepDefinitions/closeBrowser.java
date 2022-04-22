package StepDefinitions;

import io.cucumber.java.en.And;

public class closeBrowser extends Baseclass{
    @And("^Close the Browser$")
    public void CloseBrowser()
    {
  driver.close();
    }
}
