package java112.labs1;
import java.io.*;
/**
 * Lab Four - Just Reading a file.
 * @author mbpriebe
 */

public class LabFour {
    /**
     * Test if there is one arg. Sends arg to run method.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter one argument on the command line");
        } else {
            LabFour lab4 = new LabFour();
            lab4.run(args[0]);
        }
    }

    /**
     * This will receive a file, open it, and output to screen.
     * @param fileParam Name of file to open.
     */
    public void run(String fileParam) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileParam));

            while (reader.ready()) {
                System.out.println(reader.readLine());
            }

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not Found");
            fileNotFoundException.printStackTrace();
        } catch (IOException iOException) {
            System.out.println("File could not be read");
            iOException.printStackTrace();
        } catch (Exception exception) {
            System.out.println("Soem other problem");
            exception.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                        reader.close();
                }
            } catch (Exception exception) {
                System.out.println("Prblem closing file");
                exception.printStackTrace();
            }
        }
    }
}
