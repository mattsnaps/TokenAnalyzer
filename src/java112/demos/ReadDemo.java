package java112.demos;
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
        FileReader reader = new FileReader("input.txt");
        BufferedReader in = new BufferedReader(reader); 
    }
}
