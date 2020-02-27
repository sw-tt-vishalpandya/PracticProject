package TS;

import basepackage.BaseTest;
import basepackage.PO.LoginPO;
import basepackage.ReadData.ReadFromProp;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTC extends BaseTest {


    public LoginTC(WebDriver driver){
        this.driver=driver;
    }

    @Test
    public void verifyLogin() throws Exception {

        LoginPO loginPO = new LoginPO(driver);



        //Enter USer Name
        Assert.assertTrue(loginPO.enterTextInInputField(loginPO.userLogin, loginPO.userNameStr), "Unable to Enter the User Name");
        //Enter Password
        Assert.assertTrue(loginPO.enterTextInInputField(loginPO.userPassword, loginPO.passwordStr), "Unable to Enter the Password");
        //CLick on Login
        Assert.assertTrue(loginPO.clickOnLinkOrButton(loginPO.loginBtn), "Unable to click on Login");
    }

}
