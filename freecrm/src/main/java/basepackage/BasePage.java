package basepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class BasePage {

    public WebDriver driver;
    Properties properties;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean clickOnLinkOrButton(By by) {
        properties = new Properties();
        try {
            Thread.sleep(2000);
            WebElement generic_WebL = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            generic_WebL.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean enterTextInInputField(By by, String data) throws Exception {
        try {
            WebElement generic_WebL = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            if (generic_WebL.isDisplayed()) {
                generic_WebL.clear();
                generic_WebL.sendKeys(data);
                return true;
            }
            return false;
        } catch (Exception e) {
            throw e;

        }
    }


    public boolean selectValfromDropDown(By ddXpath, By valXpath) {
        try {
            Thread.sleep(2000);
            WebElement generic_WebL = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(ddXpath));
            generic_WebL.click();

            WebElement generic_WebL1 = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(valXpath));
            generic_WebL1.click();

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean enterDataInSearch(By by, String data) throws Exception {
        try {
            WebElement generic_WebL = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            if (generic_WebL.isDisplayed()) {
                Thread.sleep(1500);
                generic_WebL.sendKeys(data);

                driver.findElement(by).sendKeys(Keys.ENTER);
                return true;
            }
            return false;
        } catch (Exception e) {
            throw e;

        }
    }

    public boolean selectDate(By datePicker, By date, By time) {
        try {
            Thread.sleep(2000);
            WebElement generic_WebL = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(datePicker));
            generic_WebL.click();

            WebElement generic_WebL1 = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(date));
            generic_WebL1.click();

            WebElement generic_WebL2 = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(time));
            generic_WebL2.click();


            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean signOut(By click1, By click2) throws InterruptedException {
        Thread.sleep(2000);
        try {
            WebElement generic_WebL = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(click1));
            generic_WebL.click();

            WebElement generic_WebL1 = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(click2));
            generic_WebL1.click();

            return true;
        } catch (Exception e) {
            return false;

        }
    }
}
