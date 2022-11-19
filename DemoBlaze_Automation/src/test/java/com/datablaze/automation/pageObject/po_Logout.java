package com.datablaze.automation.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class po_Logout {
    WebDriver driver;

    public po_Logout(WebDriver driver) {
        this.driver =driver;
    }

//    @FindBy(xpath = "//*[@id=\"logout2\"]")
//    WebElement btn_Logout;

    //method
    public void clickLogout() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logout2\"]"))).click();
        driver.quit();

    }
}
