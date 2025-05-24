package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.ResultPage;
import utils.DriverFactory;

public class SubstringSteps {
    WebDriver driver = DriverFactory.getDriver();
    HomePage homePage;
    ResultPage resultPage;

    @Given("user is on homepage")
    public void user_is_on_homepage() {
        driver.get("https://agrichain.com");
        homePage = new HomePage(driver);
    }

    @When("user enters {string}")
    public void user_enters(String input) {
        homePage.enterInput(input);
    }

    @When("clicks on submit")
    public void clicks_on_submit() {
        homePage.clickSubmit();
    }

    @Then("the result should be {string}")
    public void the_result_should_be(String expected) throws InterruptedException {
        resultPage = new ResultPage(driver);
        Thread.sleep(2000); // wait for page to load
        Assert.assertEquals(expected, resultPage.getOutput());
        DriverFactory.closeDriver();
    }
}
