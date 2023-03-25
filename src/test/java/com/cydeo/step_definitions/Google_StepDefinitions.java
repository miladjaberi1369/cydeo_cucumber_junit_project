package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;
import java.time.Duration;

public class Google_StepDefinitions {

   GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user searches for apple")
    public void user_searches_for_apple(){
    googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }
    @Then("user should see apple in the title")
    public void user_should_see_apple_in_the_title(){
        BrowserUtils.verifyTitle("apple - Google Search");
    }

    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Driver.getDriver().get("https://www.google.com");
    }
    @Then("user should see the title is Google")
    public void user_should_see_the_title_is_google() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals(actualTitle, expectedTitle);
        Driver.closeDriver();

    }
}
