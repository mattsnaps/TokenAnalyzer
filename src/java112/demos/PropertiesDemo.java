package java112.demos;

import java.util.*;
import java.io.*;

/**
*
* @author mbpriebe
*/
public class  PropertiesDemo {

    /**
     * [main description]
     * @param args [description]
     */
    public static void main(String[] args) {
        PropertiesDemo demo = new PropertiesDemo();
        demo.run();
    }

    /**
     * [run description]
     */
    public void run() {

        Properties properties = new Properties();

        //reads file (Loads key value pairs)
        try {
            properties.load(this.getClass().getResourceAsStream("/demo-properties.properties"));

            //writes out the author property
            System.out.println("Author: " + properties.getProperty("author"));

            //gets all the properties
            Set<String> propertyNames = properties.stringPropertyNames();

            //Prints out just the key, not the value.
            System.out.println("The set: " + propertyNames);

            //prints out the key and value. 
            for (String key : propertyNames) {
                System.out.println("The Key is: " + key + " Value: " + properties.getProperty(key));
            }



        } catch (IOException ioException) {
            System.out.println("there was a problem reading properties file.");
            ioException.printStackTrace();
        } catch (Exception exception) {
            System.out.println("Some problem....");
            exception.printStackTrace();
        }

    }
}
