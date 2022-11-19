package com.datablaze.automation.utils;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager {
    public static  WebDriver getChromeDriver() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\valdz\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
}

