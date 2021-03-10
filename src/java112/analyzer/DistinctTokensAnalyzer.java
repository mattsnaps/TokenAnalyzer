package java112.analyzer;
import java.util.*;
import java.io.*;

/**
 *Distinct token anlysis that determins what the distinct otkens are and prints them in a text file.
 * @author mbpriebe
 */

public class DistinctTokensAnalyzer implements TokenAnalyzer {
    // Only allowed instance variable
    private Set<String> distinctTokens = new TreeSet<String>();
    private Properties properties;

    /**
     * [DistinctTokensAnalyzer description]
     */
    public DistinctTokensAnalyzer() {

    }
    /**
     * [DistinctTokensAnalyzer description]
     * @param properties [description]
     */
    public DistinctTokensAnalyzer(Properties properties) {
        this();
        this.properties = properties;
    }

    /**
     * [getDistinctTokens description]
     * @return [description]
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
     * @param outputFilePath outputfile path.
     */
    public void generateOutputFile(String inputFilePath) {

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
