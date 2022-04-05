package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
    // POM design
    // create constructor
    // initialize the driver instanv=ce and this class

    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "q")
    public WebElement searchBox;
}
