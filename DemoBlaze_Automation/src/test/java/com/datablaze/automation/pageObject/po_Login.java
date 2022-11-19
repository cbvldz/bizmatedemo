package com.datablaze.automation.pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class po_Login {
    WebDriver driver;

    public po_Login(WebDriver driver) {
        this.driver = driver;

    }

    @FindBy(id = "loginusername")
    WebElement username_fld;

    @FindBy(id = "loginpassword")
    WebElement pw_fld;

    @FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
    WebElement login_btn;


    //ourMethods
    public void validUsername() {
        username_fld.sendKeys("cherryvtest");
    }

    public void invalidUsername() {
        username_fld.sendKeys("cherrytest");

    }

    public void validPw() {
        pw_fld.sendKeys("asd0asd0");
    }

    public void clickLogin_btn() throws InterruptedException {
        String validUn = "cherryvtest";
        if (username_fld.equals("cherryvtest")) {
            login_btn.click();
        }
        else  {
            login_btn.click();
            Thread.sleep(3000);
            Alert alert = driver.switchTo().alert();
            Thread.sleep(3000);
            String alertMessage = driver.switchTo().alert().getText();
            System.out.print(alertMessage);
            Thread.sleep(3000);
            alert.accept();
        }
    }
}



