package java112.labs1;
import java.io.*;
/**
 * Lab 6 - reading and writing
 * @author mbpriebe
 */
public class LabSix {
    /**
     * [main description]
     * @param args [description]
     */

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Enter two command line arguments: ");
        } else {
            LabSix lab6 = new LabSix();
            lab6.run(args[0], args[1]);
        }
    }
    /**
     * [run description]
     * @param inputName  [description]
     * @param outputName [description]
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
