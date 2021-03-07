package java112.demos;

import java.util.*;
import java.io.*;

/**
 * @author mbpriebe
 */

public class MapDemo {
    /**
     * [main description]
     * @param args [description]
     */
    public static void main(String[] args) {
        MapDemo demo = new MapDemo();
        demo.run();
    }

    /**
     * [run description]
     */
    public void run() {

        //Create a HashMap Object (unsorted. Tree Map is sorted)
        Map<Integer, String> myMap = new HashMap<Integer, String>();

        // add some key/values
        myMap.put(2, "two");
        myMap.put(1, "Cars");
        myMap.put(10, "tens");

        System.out.println(myMap);

        //entrySet returns a Set of Map.Entry (which is a key:value pair)
        for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

    }
}
