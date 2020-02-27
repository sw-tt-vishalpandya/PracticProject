package basepackage.PO;

import basepackage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateTaskPO extends BasePage {

    public CreateTaskPO(WebDriver driver) {
        super(driver);
    }

    public By newButton= By.xpath("//button[text()='New']");
    public By createTask= By.xpath("//span[contains(text(),'Tasks')]");
    public By typeDD=By.xpath("//div[@name='type']");
    public By typeDDValue=By.xpath("//span[contains(text(),'General Support')]");
    public By title=By.xpath("//input[@name='title']");
    public By assignTo=By.xpath("//div[@class='ui fluid selection dropdown']");
    public By dueDate=By.xpath("(//input[@class='calendarField'])[1]");
    public By dueDateVal=By.xpath("//div[@class='react-datepicker']//div[text()='1']");
    public By dueDateTime=By.xpath("//li[contains(text(),'17:00')]");
    public By closeDate=By.xpath("(//input[@class='calendarField'])[2]");
    public By closeDateVal=By.xpath("//div[@class='react-datepicker']//div[text()='21']");
    public By closeDateTime=By.xpath("//li[contains(text(),'17:30')]");
    public By saveBtn=By.xpath("//button[contains(text(),'Save')]");



    public By contact=By.xpath("(//input[@class='search'])[1]");
    public By deal=By.xpath("(//input[@class='search'])[2]");
    public By case1=By.xpath("(//input[@class='search'])[3]");
    public By tag=By.xpath("(//input[@class='search'])[4]");
    public By description=By.xpath("//textarea[@name='description']");
    public By completion=By.xpath("//input[@name='completion']");
    public By priorityDD=By.xpath("//div[@name='priority']");
    public By priorityDDVal=By.xpath("//span[contains(text(),'Low')]");
    public By statusDD=By.xpath("//div[@name='status']");
    public By statusDDVal=By.xpath("//span[contains(text(),'Enquiring')]");
    public By identifier=By.xpath("//input[@name='identifier']");

    public By logoutIcon=By.xpath("(//i[@class='settings icon'])[1]");
    public By logoutLink=By.xpath("//span[contains(text(),'Log Out')]");


}
