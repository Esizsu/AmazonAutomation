package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    // THIS CLASS WILL ONLY USED FOR  getting the data from
    //    configuration.properties file
    private static Properties properties;  // we made private hiding data of the ConfigurationReader used Encpsulation.
                                           // and made it static (to reach it with in that class) to reach that datas we use getter
                                           // as  public static String getProperty
    static {
//        path of the config file
        String path = "configuration.properties";
        try {
//            Opening the file
            FileInputStream file = new FileInputStream(path);
//            loading the file
            properties= new Properties();
            properties.load(file);
//            closing the file
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//  This method accepts the key and returns the value WILL USE IT TO GET OUR DATA FROM configuration.properties PUT IN KEY
    public static String getProperty(String key){
        return properties.getProperty(key);
    }

//    Test
//    @Test
//    public void test1(){
//        System.out.println(getProperty("google_url"));//https://www.google.com
//        System.out.println(getProperty("test_environment"));
//        System.out.println(getProperty("url"));
//    }


    }

