package basepackage;

import basepackage.ReadData.ReadFromProp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;


    @BeforeClass
    public void beforeClass() throws IOException {
    ReadFromProp readFromProp= new ReadFromProp();
        launchBrowser();
        driver.get(readFromProp.getURL());
        driver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60L, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }




@AfterClass
public void afterClass(){
       // driver.quit();
}

private void launchBrowser() throws IOException {
        ReadFromProp readFromProp= new ReadFromProp();
        String browserName=readFromProp.getBrower();
        System.out.println(browserName);
        if (browserName.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", readFromProp.getPath());
            driver = new ChromeDriver();
        }
    }
}
