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
        try {
            FileReader reader = new FileReader("input.txt");
        } catch (FileNotFoundException fileNotFoundException) {
            //message to the user.
            System.out.println("File was not found");
            //prints to stack trace.
            fileNotFoundException.printStackTrace();
        }
    }
}
