package java112.analyzer;
import java.util.*;
import java.io.*;
import java112.utilities.*;

/**
 *Distinct token anlysis that determins what the distinct otkens are and prints them in a text file.
 * @author mbpriebe
 */

public class DistinctTokensAnalyzer implements TokenAnalyzer {
    // Only allowed instance variable
    private Set<String> distinctTokens = new TreeSet<String>();
    private Properties properties;

    /**
     * Constructor class. called when object instantiated.
     */
    public DistinctTokensAnalyzer() {

    }
    /**
     * Constructor class
     * @param properties properties file passed in.
     */
    public DistinctTokensAnalyzer(Properties properties) {
        this();
        this.properties = properties;
    }

    /**
     * get ths distinct tokens.
     * @return distinct tokens.
     */
    public Set<String> getDistinctTokens() {
        return distinctTokens;
    }

    /**
     * adds distinct tokens to distinct token TreeSet.
     * @param token tokens (words) passed from reading the file.
     */
    public void processToken(String token) {
        distinctTokens.add(token);
    }

    /**
     * Generates the distinct token output file.
     * @param inputFilePath  inputfile path
     *
     */
    public void generateOutputFile(String inputFilePath) {

        String outputFilePath = properties.getProperty("output.directory") +
                properties.getProperty("output.file.distinct");

        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(outputFilePath)))) {
            //writer.println(distinctTokens.size());
            for (String word : distinctTokens) {
                writer.println(word);
            }
        } catch (IOException iOException) {
            System.out.println("Write Distinct File Error...");
            iOException.printStackTrace();
        } catch (Exception exception) {
            System.out.println("Other Problem with Distint File...");
            exception.printStackTrace();
        }
    }
}
