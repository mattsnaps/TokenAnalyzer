package java112.demos;
import java.io.*;
/**
 * Demonstrate writing a file
 * @author mbpriebe
 */

public class WriteDemo {
    /**
     *create a file, write to file.
     * @param args command line args
     */
    public static void main(String[] args) {

        PrintWriter writer = null;

        try {
            //FileWriter fileWriter = new FileWriter("output.txt");
            //BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            //PrintWriter writer = new PrintWriter(bufferedWriter);

            writer = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
        } catch (IOException iOException) {
            System.out.println("Problem writing file.");
            iOException.printStackTrace();
        } catch (Exception exception) {
            System.out.println("General Problem");
            exception.printStackTrace();
        }
    }
}
