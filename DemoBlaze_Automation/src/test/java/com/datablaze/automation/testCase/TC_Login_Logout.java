package com.datablaze.automation.testCase;
import com.datablaze.automation.pageObject.po_Homepage;
import com.datablaze.automation.pageObject.po_Login;
import com.datablaze.automation.pageObject.po_Logout;
import com.datablaze.automation.utils.BrowserManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC_Login_Logout {

    @Test
    public void TC1_validateLogin() {
        WebDriver driver = BrowserManager.getChromeDriver();
        po_Homepage home = PageFactory.initElements(driver, po_Homepage.class);
        po_Login obj = PageFactory.initElements(driver, po_Login.class);
        po_Logout out = PageFactory.initElements(driver, po_Logout.class);

        home.navTo_login();
        obj.validUsername();
        obj.validPw();
        obj.clickLogin_btn();
        out.clickLogout();
    }
    @Test
    public void TC2_invalidLogin() throws InterruptedException {
        WebDriver driver = BrowserManager.getChromeDriver();
        po_Homepage home = PageFactory.initElements(driver, po_Homepage.class);
        po_Login obj = PageFactory.initElements(driver, po_Login.class);

        home.navTo_login();
        obj.invalidUsername();
        obj.validPw();
        obj.negativeClickLogin_btn();

    }
}