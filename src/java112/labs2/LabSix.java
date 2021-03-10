package java112.labs2;

import java.util.*;
import java.io.*;
import java112.utilities.*;

/**
 *
 * @author mbpriebe
 */

public class LabSix implements PropertiesLoader {

    private Properties properties;

    /**
     * calls the run method. Passes command line argument.
     * @param args [description]
     */
    public static void main(String[] args) {
        LabSix run = new LabSix();

        if (args.length != 1) {
            System.out.println("Please enter one argument on the command line");
        } else {
            run.run(args[0]);
        }

    }


//
//     public void loadProperties(String propertiesFilePath)  {
//     properties = new Properties();
//     try {
//         properties.load(this.getClass().getResourceAsStream(propertiesFilePath));
//     } catch(IOException ioe) {
//         System.out.println("Can't load the properties file");
//         ioe.printStackTrace();
//     } catch(Exception e) {
//         System.out.println("Problem: " + e);
//         e.printStackTrace();
//     }
// }

    /**
     * passes argument to loadProperties. Prints out properties.
     * @param arg Command Line Argument. Properties file path
     */
    public void run(String arg) {
         this.properties = loadProperties(arg);

         System.out.println(properties.getProperty("name"));
         System.out.println(properties.getProperty("email.address"));
         System.out.println(properties.getProperty("car.type"));
    }



}
