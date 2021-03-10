package java112.analyzer;
import java.util.*;
import java.io.*;

/**
 *
 * @author mbpriebe
 */

public class LargestTokensAnalyzer implements TokenAnalyzer{

    private Properties properties;
    private Set<String> largestToken = new TreeSet<String>();
    private int minimumTokenLength;

    /**
     * [LargestTokenAnalyzer description]
     */
    public LargestTokensAnalyzer() {

    }
    /**
     * [LargestTokenAnalyzer description]
     * @param properties [description]
     */
    public LargestTokensAnalyzer(Properties properties) {
        this();
        this.properties = properties;
        minimumTokenLength = Integer.parseInt(properties.getProperty("largest.words.minimum.length"));

    }

    public Set<String> getLargestTokens() {
        return largestToken;
    }

    /**
     * [getLargestToken description]
     * @return [description]
     */
    //public Set<String> getLargestToken() {
    //    return largestTokens;
    //}

    public void processToken(String token) {

        if (token.length() >= minimumTokenLength) {
            largestToken.add(token);
        }
    }

    public void generateOutputFile(String inputFilePath) {
        String outputFilePath = properties.getProperty("output.directory") +
                properties.getProperty("output.file.largest.words");

        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(outputFilePath)))) {
            //writer.println(distinctTokens.size());
            for (String word : largestToken) {
                writer.println(word);
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
