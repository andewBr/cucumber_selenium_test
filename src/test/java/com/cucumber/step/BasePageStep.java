package com.cucumber.step;

import com.cucumber.config.WebdriverBeanConfig;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {WebdriverBeanConfig.class})
public class BasePageStep {


    @Autowired
    private WebDriver driver;

    public BasePageStep() {

    }

    @Before
    public void before() {
        System.out.println("test");
    }

    @After
    public void after() {
        driver.quit();
    }


}
