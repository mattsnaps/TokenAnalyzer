package java112.labs2;

import java.util.*;
import java.io.*;

/**
 *
 * @author mbpriebe
 */

public class LabThree {

    private Properties properties;

    /**
     * calls the run method. Passes command line argument.
     * @param args properties path file.
     */
    public static void main(String[] args) {
        LabThree run = new LabThree();

        if (args.length != 1) {
            System.out.println("Please enter one argument on the command line");
        } else {
            run.run(args[0]);
        }


    }

    /**
     * loads the properties file value pairs.
     * @param propertiesFilePath path to properties file.
     */
    public void loadProperties(String propertiesFilePath)  {
    properties = new Properties();
    try {
        properties.load(this.getClass().getResourceAsStream(propertiesFilePath));
    } catch(IOException ioe) {
        System.out.println("Can't load the properties file");
        ioe.printStackTrace();
    } catch(Exception e) {
        System.out.println("Problem: " + e);
        e.printStackTrace();
    }
}

    /**
     * passes argument to loadProperties. Prints out properties.
     * @param arg Command Line argument Properties file path
     */
    public void run(String arg) {
         loadProperties(arg);
         System.out.println(properties.getProperty("name"));
         System.out.println(properties.getProperty("email.address"));
         System.out.println(properties.getProperty("car.type"));
    }



}
