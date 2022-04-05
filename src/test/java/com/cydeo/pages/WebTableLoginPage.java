package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {
    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "username")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

    // login with ready username and passwords
    public void login(){

        usernameInput.sendKeys("Test");
        passwordInput.sendKeys("Tester");
        loginButton.click();


    }
    // login with parameters
    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
    // login with conf properties
    public void loginWithConfPr(){
        usernameInput.sendKeys(ConfigurationReader.getProperty("web.table.username"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("web.table.password"));
        loginButton.click();
    }

}
