package java112.labs1;
import java.util.*;
import java.io.*;

/**
 *Lab Seven Class - Makign a list and writing to file.
 * @author mbpriebe
 */
public class LabSeven {
    List<String> myList;

    /**
     * instantiates LabSeven object and calls the run method.
     * @param args name of output file
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter one argument on the command line, an output file name");
        } else {
            LabSeven lab7 = new LabSeven();
            lab7.run(args[0]);
        }
    }
    /**
     * instantiates Array list and fills with items
     * calls the writeListToOutputFile method
     * @param argument output file name
     */
    public void run(String argument) {
        myList = new ArrayList<String>();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");
        myList.add("five");
        myList.add("six");
        myList.add("seven");
        myList.add("eight");
        myList.add("nine");
        myList.add("ten");

        writeListToOutputFile(argument);
    }
    /**
     * writes Arraylist to output file
     * @param argument name of output file.
     */
    public void writeListToOutputFile(String argument) {

        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(argument)))) {

            for (String listItem: myList) {
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
