package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends Basepage{

    public OrderPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "product")
    public WebElement productType;

    @FindBy(name = "quantity")
    public WebElement inputQuantity;

    @FindBy(name = "name")
    public WebElement inputname;

    @FindBy(name = "street")
    public WebElement inputStreet;




    @FindBy(name = "city")
    public WebElement inputCity;

    @FindBy(name = "state")
    public WebElement inputState;


    @FindBy(name = "zip")
    public WebElement inputZip;

    @FindBy(xpath = "//input[@type='radio']")
    public WebElement inputCreditCard;

    public void selectCreditCardMethod(String string){
        Driver.getDriver().findElement(By.xpath("//input[@value="+"'"+string+"']")).click();
    }
    @FindBy(xpath = "//input[@placeholder='The number on the card']")
    public WebElement creditCardNumberInput;

    @FindBy(xpath = "//input[@placeholder='e.g. 04/24']")
    public WebElement expiryDateInput;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processButton;

    @FindBy(xpath = "//td[.='Sherlock Holmes']")
    public WebElement firstRaw;

    public void assertion(String string){
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//td[1]")).getText().equals(string));
    }


}
