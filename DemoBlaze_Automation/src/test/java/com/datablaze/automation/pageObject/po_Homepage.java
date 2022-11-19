package com.datablaze.automation.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class po_Homepage {
    WebDriver driver;

    public po_Homepage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(id = "login2")
    WebElement login_navLink;

    //method
    public void navTo_login(){
        login_navLink.click();
    }
}
