package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Parameters {

    private static Properties properties;

    static {
        try {
            String path = "";
            String mainPath = System.getProperty("user.dir");
            path = mainPath+"\\src\\main\\java\\Parameters\\parameters.properties";
            FileInputStream fileEnvironment = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileEnvironment);
            fileEnvironment.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getEnvironmentParameters(String key) {
        return properties.getProperty(key);
    }
}