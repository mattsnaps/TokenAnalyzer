package java112.labs1;
import java.io.*;
/**
 * Lab Five - writing to a file
 * @author mbpriebe
 */

public class LabFive {
    /**
     * Will pass arguments to the run method. test make sure 2 args
     * @param args filename, message
     */
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please enter two arguments on the command line, a file name and a message");
        } else {
            LabFive lab5 = new LabFive();
            lab5.run(args[0], args[1]);
        }
    }
    /**
     * Creates a new file and writes a message in it.
     * @param fileName File name
     * @param message  message in file
     */
    public void run (String fileName, String message) {

        PrintWriter writer = null;

        try {
            writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
            writer.println(message);
        } catch (IOException iOexception) {
            System.out.println("Problem Writing File");
            iOexception.printStackTrace();
        } catch (Exception exception) {
            System.out.println("Some other problem");
            exception.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
