package basepackage.PO;

import basepackage.BasePage;
import basepackage.ReadData.ReadFromProp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPO extends BasePage {

    public LoginPO(WebDriver driver) {
        super(driver);
    }



    public By userLogin=By.xpath("//input[@name='email']");
    public By userPassword=By.xpath("//input[@name='password']");
    public By loginBtn=By.xpath("//div[text()='Login']");


    ReadFromProp readFromProp= new ReadFromProp();
    public String userNameStr=readFromProp.getUserName();
    public String passwordStr=readFromProp.getPassword();


}
