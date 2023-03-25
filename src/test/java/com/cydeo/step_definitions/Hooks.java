package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;

public class Hooks {

    //@Before
    public void setupMethod(){
        //Driver.getDriver().get("https//google.com");
        System.out.println("---> @Before: RUNNING BEFORE EACH SCENARIO ");
    }
    @After
    public void teardownMethod(){
        System.out.println("---> @After: RUNNING AFTER EACH SCENARIO ");
    }
    @BeforeStep
    public void setupStep(){
        System.out.println("---> @BeforeStep: RUNNING BEFORE EACH SCENARIO ");
    }
    @AfterStep
    public void teardownStep(){
        System.out.println("---> @AfterStep: RUNNING AFTER EACH SCENARIO ");
    }
}
