package java112.analyzer;
import java.util.*;
import java.io.*;
import java112.utilities.*;

/**
 *number of times a token with a certain number of character shows up in file.
 *Output file uses number and histgram to display results.
 *@author mbpriebe
 */
public class TokenLengthsAnalyzer implements TokenAnalyzer {

    private Map<Integer, Integer> tokenLengths;
    private Properties properties;

    /**
     * Constructor Class
     */
    public TokenLengthsAnalyzer() {
        tokenLengths = new TreeMap<Integer, Integer>();
    }

    /**
     * Constructor class add properties file.
     * @param properties properties file.
     */
    public TokenLengthsAnalyzer(Properties properties) {
        this();
        this.properties = properties;
    }

    /**
     * get method for tests.
     * @return tokenLengths
     */
    public Map<Integer, Integer> getTokenLengths() {
        return tokenLengths;
    }

    /**
     * Process Token. Sees how many instances of a character length there are.
     * puts results in a map.
     * @param token word.
     */
    public void processToken(String token) {

        int key;
        int value;

        key = token.length();

        if (tokenLengths.containsKey(key)) {

            value = tokenLengths.get(key);

            value++;

            tokenLengths.put(key, value);

        } else {
            tokenLengths.put(key, 1);

        }

    }

    /**
     * This just does some math SO I can create a histogram later.
     * @return returns a ratio used for histogram.
     */
    public double histogram() {
        double largestValue = 0;
        double ratio;

        largestValue = Collections.max(tokenLengths.values());

        ratio = 80 / largestValue;

        return ratio;
    }

    /**
     * generates the output file type.
     * @param inputFilePath path of file coming in.
     */
     public void generateOutputFile(String inputFilePath) {
         double ratio;
         String astrick = "*";
         ratio = histogram();

         String outputFilePath = properties.getProperty("output.directory") +
                 properties.getProperty("output.file.token.lengths");

        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(outputFilePath)))) {
            for (Map.Entry<Integer, Integer> entry: tokenLengths.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();

                writer.println(key + "\t" + value);
             }


             for (Map.Entry<Integer, Integer> entry: tokenLengths.entrySet()) {

                 int repeatTimes = (int) Math.round(ratio * entry.getValue());

                 writer.println(entry.getKey() + " " + astrick.repeat(repeatTimes));
              }
         } catch (IOException iOException) {
             System.out.println("Write Largest Token File Error...");
             iOException.printStackTrace();
         } catch (Exception exception) {
             System.out.println("Other Problem with Largest Token File...");
             exception.printStackTrace();
         }

     }
}
