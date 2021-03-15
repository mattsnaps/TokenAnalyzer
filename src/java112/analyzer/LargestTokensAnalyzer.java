package java112.analyzer;
import java.util.*;
import java.io.*;

/**
 *determines the tokens largest than  min and prints out in txt file.
 * @author mbpriebe
 */

public class LargestTokensAnalyzer implements TokenAnalyzer{

    private Properties properties;
    private Set<String> largestToken;
    private int minimumTokenLength;

    /**
     * Constructor class for larges Tokens Analyzer
     */
    public LargestTokensAnalyzer() {
        largestToken = new TreeSet<String>();
    }
    /**
     * Constructor class
     * @param properties properties file passed in.
     */
    public LargestTokensAnalyzer(Properties properties) {
        this();
        this.properties = properties;
        minimumTokenLength = Integer.parseInt(properties.getProperty("largest.words.minimum.length"));

    }
    /**
     * getter for largest Tokens
     * @return largest Tokens (words)
     */
    public Set<String> getLargestTokens() {
        return largestToken;
    }

    /**
     * Determines if token is above min. length. If is adds to list
     * @param token word Token
     */
    public void processToken(String token) {

        if (token.length() >= minimumTokenLength) {
            largestToken.add(token);
        }
    }

    /**
     * generates an output file for largest words file.
     * @param inputFilePath path for input file.
     */
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
