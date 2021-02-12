package java112.labs1;
import java.util.*;
import java.io.*;

/**
 * Lab Eight - writes to a set and writes to file
 * @author mbpriebe
 */
public class LabEight {
    Set<String> mySet;

    /**
     * instantiates a LabEight object and calls run method passes argument
     * @param args file name
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter one argument on the command line, an output file name");
        } else {
            LabEight lab8 = new LabEight();
            lab8.run(args[0]);
        }
    }
    /**
     * Instantiates a TreeSet and adds items to it.
     * @param fileName fileName
     */
    public void run(String fileName) {

        mySet = new TreeSet<String>();

        mySet.add("one");
        mySet.add("one");
        mySet.add("five");
        mySet.add("two");
        mySet.add("four");
        mySet.add("two");
        mySet.add("three");
        mySet.add("three");
        mySet.add("four");
        mySet.add("three");

        writeSetToOutputFile(fileName);
    }
    /**
     * Writes the set to an output file
     * @param fileName file name
     */
    public void writeSetToOutputFile(String fileName) {

        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName)))) {

            for (String listItem: mySet) {
                writer.println(listItem);
            }
        } catch (IOException iOException) {
            System.out.println("Problem writing File.");
            iOException.printStackTrace();
        } catch (Exception exception) {
            System.out.println("Some problem occurred.");
            exception.printStackTrace();
        }
    }
}
