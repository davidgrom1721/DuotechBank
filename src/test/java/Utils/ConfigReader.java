package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {


    private static Properties properties;

    static {
        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("config.properties");
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static String getProperty(String key){
        return properties.getProperty(key);
    }


    public static void setProperties(Properties properties) {
        ConfigReader.properties = properties;
    }

}
