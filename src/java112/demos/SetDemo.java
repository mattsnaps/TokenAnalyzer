package java112.demos;
import java.util.*;

/**
 * SetDemo class
 * @author mbpriebe
 */

public class SetDemo {

    /**
     * Creates a set. add strings to the set and displays.
     */
    public void run() {
        Set<String> set = new HashSet<String>();
        set.add("one");
        set.add("two");
        set.add("one");
        set.add("one");
        set.add("three");
        set.add("four");

        System.out.println(set);

        for (String item : set) {
            System.out.println("The item is: " + item);
        }
    }

    /**
     * instantiates the demo class and starts running
     * @param args command line arguments
     */
    public static void main(String[] args) {
        SetDemo demo = new SetDemo();
        demo.run();
    }
}
