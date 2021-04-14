package java112.analyzer;
import java.util.*;
import java.io.*;
import java112.utilities.*;

/**
 *
 *@author mbpriebe
 */
public class TokenLengthsAnalyzer implements TokenAnalyzer {

    private Map<Integer, Integer> tokenLengths;
    private Properties properties;

    /**
     * [TokenLengthsAnalyzer description]
     */
    public TokenLengthsAnalyzer() {
        tokenLengths = new TreeMap<Integer, Integer>();
    }

    /**
     * [TokenLengthsAnalyzer description]
     * @param properties [description]
     */
    public TokenLengthsAnalyzer(Properties properties) {
        this();
        this.properties = properties;
    }

    /**
     * [getTokenLengths description]
     * @return [description]
     */
    public Map<Integer, Integer> getTokenLengths() {
        return tokenLengths;
    }

    /**
     * [processToken description]
     * @param token [description]
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
     * [generateOutputFile description]
     * @param inputFilePath [description]
     */
     public void generateOutputFile(String inputFilePath) {
         String outputFilePath = properties.getProperty("output.directory") +
                 properties.getProperty("output.file.token.lengths");

         try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(outputFilePath)))) {
             //writer.println(distinctTokens.size());
             for (Map.Entry<Integer, Integer> entry: tokenLengths.entrySet()) {
                     writer.println("Keys: " + entry.getKey() + " Value: " + entry.getValue());
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
