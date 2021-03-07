package java112.labs2;

import java.util.*;
import java.io.*;

public class LabTwoFour {

    private Map<String, Integer> myMap;
    private Map<String, Integer> treeMap;

    /**
     * [main description]
     * @param args [description]
     */
    public static void main(String[] args) {
        LabTwoFour run = new LabTwoFour();
        run.run();
    }

    public void run() {
        myMap = new HashMap<String, Integer>();

        myMap.put("Robin Hobb", 1);
        myMap.put("Glen Cook", 2);
        myMap.put("Adrian Tchaikovsky", 3);
        myMap.put("Three", 43);

        for (Map.Entry<String, Integer> entry: myMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        if (myMap.containsKey("Three")) {
            System.out.println(myMap.get("Three"));
        } else {
            System.out.println("No such key");
        }

        treeMap = new TreeMap<String, Integer>(myMap);

        for (Map.Entry<String, Integer> entry: treeMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
