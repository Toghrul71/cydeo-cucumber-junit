package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
In the class we will be able to pass pre&post conditions to each scenario and each step
 */
public class Hooks {
    @Before (value = "@login", order = 1)// Import @Before from io.cucumber.java
    public void setupScenario(){
        System.out.println("====Setting up browser using cucumber @Before");

    }
    @Before (value = "@db", order = 2)// // only for db-database
    public void setupForDataScenario(){
        System.out.println("====Setting up browser using cucumber @Before");

    }
    @After
    public void tearDownScenario(Scenario scenario){
        if(scenario.isFailed()){
            byte[] screenshot= ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", scenario.getName());
            Driver.closeDriver();
        }


        //System.out.println("====Closing browser using cucumber @After");
        //System.out.println("Tahe screenshot if failed");
    }
    @BeforeStep
    public void setupStep(){
        System.out.println("----> applying setup @Before step");
    }
    @AfterStep
    public void afterStep(){
        System.out.println("----> @AfterStep");
    }
}
