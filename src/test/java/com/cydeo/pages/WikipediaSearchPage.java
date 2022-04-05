package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaSearchPage {

    public WikipediaSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@class='vector-search-box-input']")
    public WebElement searchButton;

    @FindBy(xpath = "//input[@title='Go to a page with this exact name if it exists']")
    public WebElement submit;

    @FindBy(xpath="//h1[@id='firstHeading']")
    public WebElement mainHeader;
}
