package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage=new GoogleSearchPage();

    @When("user types apple and clicks enter")
    public void user_types_and_clicks_enter2() {
        googleSearchPage.searchBox.sendKeys("apple"+Keys.ENTER);
    }

    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String string) {
        googleSearchPage.searchBox.sendKeys(string+Keys.ENTER);
    }

    @Then("user sees apple in the google title")
    public void user_sees_in_the_google_title() {
        String expectedTitle="apple - Google Search";
        String actualTitle=Driver.getDriver().getTitle();

        // Junit assertion accepts first arg as expected , second as actual
        Assert.assertEquals("Title is not as expected",actualTitle,expectedTitle);

    }












    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get("https://www.google.com");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        // Write code here that turns the phrase above into concrete actions
        String expectedTitle ="Google";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
