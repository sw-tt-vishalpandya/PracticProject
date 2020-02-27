package basepackage.ReadData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProp {

    public Properties properties;
    public FileInputStream fileInputStream;



    public ReadFromProp() {
        properties= new Properties();
        try {
            fileInputStream=new FileInputStream("D:\\SW-VishalPandya-DATA\\Training\\freecrm\\src\\main\\resources\\config.properties");
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String getBrower() {
        return properties.getProperty("browser");
    }

    public String getPath() {
        return properties.getProperty("loaddriverpath");
    }

    public String getUserName() {
        return properties.getProperty("username");
    }

    public String getPassword() {
        return properties.getProperty("password");
    }

    public String getURL(){
        return properties.getProperty("url");
    }


}
