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

    }
}
