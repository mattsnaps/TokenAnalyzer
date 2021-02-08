package java112.labs1;
import java.io.*;
/**
 * Lab 6 - reading and writing
 * @author mbpriebe
 */
public class LabSix {
    /**
     * Tests makes sure two args. Passes them to run method.
     * @param args Input filename and output file name.
     */

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please enter two arguments on the command line, an input file name and an output file name");
        } else {
            LabSix lab6 = new LabSix();
            lab6.run(args[0], args[1]);
        }
    }
    /**
     * Will open one file, read message write to a new second file..
     * @param inputName  name of file to open and read
     * @param outputName name of file to create and write to. 
     */
    public void run(String inputName, String outputName) {
        BufferedReader reader = null;
        PrintWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(inputName));
            writer = new PrintWriter(new BufferedWriter(new FileWriter(outputName)));

            while (reader.ready()) {
                writer.println(reader.readLine());
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
                if (reader != null || writer != null) {
                        reader.close();
                        writer.close();
                }
            } catch (Exception exception) {
                System.out.println("Prblem closing file");
                exception.printStackTrace();
            }
        }
    }
}
