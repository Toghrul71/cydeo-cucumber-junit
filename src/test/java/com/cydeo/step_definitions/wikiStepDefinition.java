package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class wikiStepDefinition {
    WikipediaSearchPage wikipediaSearchPage=new WikipediaSearchPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://en.wikipedia.org");
    }
    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {
    wikipediaSearchPage.searchButton.sendKeys(string);
    }

    @When("User click wiki search button")
    public void user_click_wiki_search_button() {
    wikipediaSearchPage.submit.click();
    }
    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {
        String expected="Steve Jobs - Wikipedia";
        String actual=Driver.getDriver().getTitle();
        Assert.assertEquals(expected,actual);
    }

    @Then("User sees {string} is in the main header")
    public void userSeesSteveJobsInTheMainHeader(String string) {
    Assert.assertTrue(wikipediaSearchPage.mainHeader.isDisplayed());
    Assert.assertTrue(wikipediaSearchPage.mainHeader.getText().equals(string));
    }
}
