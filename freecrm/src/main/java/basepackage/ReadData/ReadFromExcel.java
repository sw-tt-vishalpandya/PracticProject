package basepackage.ReadData;

//import org.apache.commons.io.FileUtils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadFromExcel {



    private static XSSFWorkbook workBook;
    private static XSSFSheet sheet;
    private static XSSFCell cell;
    private static XSSFRow row;

    private static WebDriverWait wait;


    public static ArrayList<Object[]> getExcelData() throws Exception {

        ArrayList<Object[]> myData = new ArrayList<Object[]>();
        String filePath = "D:\\SW-VishalPandya-DATA\\Training\\freecrm\\src\\main\\resources\\Data.xlsx";
        setExcelFile(filePath, 0);

        for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {

            String task = sheet.getRow(rowNum).getCell(0).getStringCellValue();
            String contact = sheet.getRow(rowNum).getCell(1).getStringCellValue();
            String deal1 = sheet.getRow(rowNum).getCell(2).getStringCellValue();
            String case1 = sheet.getRow(rowNum).getCell(3).getStringCellValue();
            String tags = sheet.getRow(rowNum).getCell(4).getStringCellValue();
            String description = sheet.getRow(rowNum).getCell(5).getStringCellValue();
            String completion = sheet.getRow(rowNum).getCell(6).getStringCellValue();
            String identifier = sheet.getRow(rowNum).getCell(7).getStringCellValue();



            System.out.println(task);
            System.out.println(contact);
            System.out.println(deal1);
            System.out.println(case1);
            System.out.println(tags);
            System.out.println(description);
            System.out.println(completion);
            System.out.println(identifier);

            System.out.println("=====================");

            Object[] ob = { task, contact, deal1, case1, tags, description, completion, identifier };
            myData.add(ob);

            //myData.add(new Object[] {userName, password});
        }

        workBook.close();
        return myData;

    }



    private static void setExcelFile(String path, int sheetNo) throws Exception {
        try {
            FileInputStream fis = new FileInputStream(path);
            workBook = new XSSFWorkbook(fis);
            sheet = workBook.getSheetAt(sheetNo);

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }

  /*  public static void main(String[] args) throws Exception {
            getExcelData();
    }*/

}



