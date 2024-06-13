package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.DriverFactory;

import java.time.Duration;

import static support.DriverFactory.getDriver;

public class GoogleStepDefs {
    @Given("I open url {string}")
    public void iOpenUrl(String url) {
        getDriver().get(url);
    }

    @Then("I verify page is opened")
    public void iVerifyPageIsOpened() {
        new WebDriverWait(getDriver(), Duration.ofSeconds(5)).until(ExpectedConditions
                .visibilityOfElementLocated(By.name("q")));
    }
}
