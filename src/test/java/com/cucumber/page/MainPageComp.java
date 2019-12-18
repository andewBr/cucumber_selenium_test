package com.cucumber.page;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MainPageComp {


    @Autowired
    private WebDriver remoteWebDriver;

    @Value( "${web.baseurl}")
    private String baseurl;

    public MainPageComp() {
    }

    public void open() {
        remoteWebDriver.get(baseurl);
    }

}
