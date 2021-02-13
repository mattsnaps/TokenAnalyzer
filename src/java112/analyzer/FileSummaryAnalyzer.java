package java112.analyzer;
import java.util.*;
import java.io.*;

/**
 *
 * @author mbpriebe
 */

public class FileSummaryAnalyzer implements TokenAnalyzer {

    private int totalTokenCount;
    /**
     * [getTotalTokenCount description]
     * @return [description]
     */
    public int getTotalTokensCount() {
        return totalTokenCount;
    }

    public void instantiateVariable() {
        totalTokenCount = 0;
    }

    /**
     * [processToken description]
     * @param token [description]
     */
    public void processToken(String token) {
        //System.out.println(token);
        totalTokenCount++;
    }

    /**
     * [generateOutputFile description]
     * @param inputFilePath  [description]
     * @param outputFilePath [description]
     */
    public void generateOutputFile(String inputFilePath, String outputFilePath) {

    }
}
