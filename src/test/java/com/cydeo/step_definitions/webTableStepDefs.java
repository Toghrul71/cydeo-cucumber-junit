package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class webTableStepDefs {
    WebTableLoginPage loginPage=new WebTableLoginPage();

    @Given("user is on the login page of web table app")
    public void iser_is_on_the_login_page_of_web_table_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));
    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
        loginPage.usernameInput.sendKeys(string);
    }

    @When("user enters password {string}")
    public void user_enters_password(String string) {
        loginPage.passwordInput.sendKeys(string);
    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
    loginPage.loginButton.click();
    }


    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        BrowserUtils.verifyUrlContains("orders");
    }


    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String password) {
        loginPage.login(username,password);
    }

    @When("User enters below credentials")
    public void userEntersBelowCredentials(Map<String,String> expected) {
        loginPage.usernameInput.sendKeys(expected.get("username"));
        loginPage.passwordInput.sendKeys(expected.get("password"));
        loginPage.loginButton.click();

    }
}
