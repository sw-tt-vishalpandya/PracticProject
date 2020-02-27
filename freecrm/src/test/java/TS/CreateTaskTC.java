package TS;

import basepackage.BaseTest;
import basepackage.PO.CreateTaskPO;
import basepackage.ReadData.ReadFromExcel;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class CreateTaskTC extends BaseTest {


    @DataProvider
    public Iterator<Object[]> getTestData() throws Exception {
        ArrayList<Object[]> data = ReadFromExcel.getExcelData();
        return data.iterator();

    }

    @Test(dataProvider = "getTestData")
    public void verifyTaskCreation(String title,  String contact, String deal, String casestr,
                                    String tagstr, String desc, String completion, String identifier) throws Exception {


        //Pre- Condition Login
        LoginTC loginTC= new LoginTC(driver);
        loginTC.verifyLogin();

        CreateTaskPO createTaskPO= new CreateTaskPO(driver);
        //Click on Tasks
        Assert.assertTrue(createTaskPO.clickOnLinkOrButton(createTaskPO.createTask), "Unable to click Tasks");

        //Create Task
        Thread.sleep(2500);
        Assert.assertTrue(createTaskPO.clickOnLinkOrButton(createTaskPO.newButton), "Unable to click on New");


        //Enter Title
        Assert.assertTrue(createTaskPO.enterTextInInputField(createTaskPO.title, title) ,"Unable to Enter Title");


        //Select Type
        Assert.assertTrue(createTaskPO.selectValfromDropDown(createTaskPO.typeDD, createTaskPO.typeDDValue) ,"Unable to Select Value from Dropdown");

        //Enter Close Date
         Assert.assertTrue(createTaskPO.selectDate(createTaskPO.dueDate, createTaskPO.dueDateVal, createTaskPO.dueDateTime), "Unable to Enter Close Date");

        //Enter Contact
        Assert.assertTrue(createTaskPO.enterDataInSearch(createTaskPO.contact, contact), "Unable to Enter Contact");

        //Enter Deal
        Assert.assertTrue(createTaskPO.enterDataInSearch(createTaskPO.deal, deal), "Unable to Enter Deal");

        //Enter Case
        Assert.assertTrue(createTaskPO.enterDataInSearch(createTaskPO.case1, casestr), "Unable to Enter Case");

        //Enter Close Date
       Assert.assertTrue(createTaskPO.selectDate(createTaskPO.closeDate, createTaskPO.closeDateVal, createTaskPO.closeDateTime), "Unable to Enter Close Date");

        //Enter Tag
        Assert.assertTrue(createTaskPO.enterDataInSearch(createTaskPO.tag, tagstr), "Unable to Enter Close Date");

        //Enter Description
        Assert.assertTrue(createTaskPO.enterTextInInputField(createTaskPO.description, desc), "Unable to Enter Description");

        //Enter Completion
        Assert.assertTrue(createTaskPO.enterTextInInputField(createTaskPO.completion, completion), "Unable to Enter Completion");

        //Select Priority
        Assert.assertTrue(createTaskPO.selectValfromDropDown(createTaskPO.priorityDD, createTaskPO.priorityDDVal) ,"Unable to Select Priority from Dropdown");

        //Select Status
        Assert.assertTrue(createTaskPO.selectValfromDropDown(createTaskPO.statusDD, createTaskPO.statusDDVal) ,"Unable to Select Status from Dropdown");

        //Enter Identifier
        Assert.assertTrue(createTaskPO.enterTextInInputField(createTaskPO.identifier, identifier), "Unable to Enter Identifier");

        //Click On Save
        Assert.assertTrue(createTaskPO.clickOnLinkOrButton(createTaskPO.saveBtn), "Unable to Click on Save");

        //Logout
        Assert.assertTrue(createTaskPO.signOut(createTaskPO.logoutIcon, createTaskPO.logoutLink), "Unable to Logout");

    }
}
