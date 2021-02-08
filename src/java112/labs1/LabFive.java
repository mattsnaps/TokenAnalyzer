package java112.labs1;
import java.io.*;
/**
 * Lab Five - writing to a file
 * @author mbpriebe
 */

public class LabFive {
    /**
     * Will pass arguments to the run method.
     * @param args [description]
     */
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Enter two command line arguments: ");
        } else {
            LabFive lab5 = new LabFive();
            lab5.run(args[0], args[1]);
        }
    }
    /**
     * open fo;es
     * @param fileName [description]
     * @param message  [description]
     */
    public void run (String fileName, String message) {

        PrintWriter writer = null;

        try {
            writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName + ".txt")));
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
