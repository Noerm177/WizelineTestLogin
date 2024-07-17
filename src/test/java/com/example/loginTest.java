package com.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

public class loginTest {

    public WebDriver driver;


    public loginTest () throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability ("platformName", "Android");
        caps.setCapability("deviceName", "test");
        caps.setCapability("deviceVersion", 13);
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("app","/Users/noeruvalcaba/Documents/Projectos/appium/wizeline/wizeline/app/MyDemoAppRN.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
    }
    @BeforeEach
    public void setUp () {
    }

    @Test
    public void openLogin () throws InterruptedException {
        System.out.println("running");
        WebElement menuBtn = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"open menu\"]/android.widget.ImageView"));
        menuBtn.click();
        WebElement logInLink = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Login button\"]"));
        logInLink.click();
        WebElement inputName = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"bob@example.com-autofill\"]/android.widget.TextView"));
        inputName.click();
        WebElement login = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Login button\"]"));
        login.click();

        Thread.sleep(2000);
    }

    @AfterEach
    public void teardown () {
        driver.quit();
    }
}
