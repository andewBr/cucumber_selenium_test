package com.cucumber.service;

import com.cucumber.page.MainPageComp;
import io.qameta.allure.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainPageService {

    @Autowired
    private MainPageComp page;

    @Step("open habr page")
    public void openPage() {
        page.open();
    }

}
