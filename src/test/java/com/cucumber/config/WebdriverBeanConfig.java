package com.cucumber.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.context.annotation.*;
import org.springframework.test.annotation.DirtiesContext;

import java.net.MalformedURLException;

import java.net.URI;
//import org.openqa.selenium.Proxy;

@Configuration
@ComponentScan("com.cucumber")
@PropertySources({
        @PropertySource("classpath:properties/application-dev-andrew.properties")})
public class WebdriverBeanConfig {


    @Bean
    public WebDriver containerChrome() throws MalformedURLException {

        //Proxy proxy = new Proxy();
        //proxy.setSslProxy("http://ваш-прокси-сервер:3128");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setCapability("proxy", proxy);
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("78.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);

        WebDriver driver = new RemoteWebDriver(
                URI.create("http://localhost:4444/wd/hub").toURL(), capabilities);
        return driver;
    }

//    @Bean
//    public WebDriver driverServiceChrome() {
//        WebDriverManager.chromedriver().setup();
//        return new ChromeDriver();
//    }


}
