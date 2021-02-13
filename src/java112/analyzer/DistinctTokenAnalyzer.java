package java112.analyzer;
import java.util.*;
import java.io.*;

/**
 *
 * @author mbpriebe
 */

public class DistinctTokenAnalyzer implements TokenAnalyzer {
    // Only allowed instance variable
    private Set<String> distinctTokens;

    public Set<String> getDistinctTokens() {
        return distinctTokens;
    }

    public void instantiateVariable() {
        distinctTokens = new TreeSet<String>();
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

    }
}
