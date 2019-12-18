package com.cucumber.step;

import com.cucumber.service.MainPageService;
import cucumber.api.java.en.Given;
import io.qameta.allure.Step;
import org.springframework.beans.factory.annotation.Autowired;


public class MainPageStep {

    @Autowired
    private  MainPageService mainPageService;



    @Given("I am on main habr page")
    public void openMainPage() {
        mainPageService.openPage();

    }

}
