package java112.analyzer;
import java.util.*;
import java.io.*;

/**
 *
 * @author mbpriebe
 */

public class DistinctTokensAnalyzer implements TokenAnalyzer {
    // Only allowed instance variable
    private Set<String> distinctTokens = new TreeSet<String>();

    public Set<String> getDistinctTokens() {
        return distinctTokens;
    }

    /**
     * [processToken description]
     * @param token [description]
     */
    public void processToken(String token) {
        distinctTokens.add(token);
    }
    /**
     * [generateOutputFile description]
     * @param inputFilePath  [description]
     * @param outputFilePath [description]
     */
    public void generateOutputFile(String inputFilePath, String outputFilePath) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")))) {
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
