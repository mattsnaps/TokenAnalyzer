package java112.demos;
import java.io.*;
/**Demonstrate reading a text file. Display wach line to console.
*
* @author mbpriebe
*/

public class ReadDemo {
    /**use Buffered Reader to read file line by line
    *and output each line to the console
    *@param args command line arguments
    */
    public static void main(String[] args) {
        //create it incase it fails in the try below.
        BufferedReader reader = null;
        try {
            //FileReader reader = new FileReader("input.txt");
            //BufferedReader BufferedReader = new BufferedReader(reader);
            //The above can be written as a single line.
            //BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

            reader = new BufferedReader(new FileReader("input.txt"));


            while (reader.ready()) {
                System.out.println(reader.readLine());
            }

        } catch (FileNotFoundException fileNotFoundException) {
            //message to the user.
            System.out.println("File was not found");
            //prints to stack trace.
            fileNotFoundException.printStackTrace();
        } catch (IOException inputOutputException) {
            //message to the user.
            System.out.println("File could not be read");
            //prints to stack trace.
            inputOutputException.printStackTrace();
        } catch (Exception exception) {
            //message to the user.
            System.out.println("Some other problem happened");
            //prints to stack trace.
            exception.printStackTrace();
        } finally {
            //This will be the last step. have to close file up.
            //need another 'try' Thing to do first.
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (Exception exception) {
                //message to the user.
                System.out.println("Some problem closing file.");
                //prints to stack trace.
                exception.printStackTrace();
            }
        }
    }
}
