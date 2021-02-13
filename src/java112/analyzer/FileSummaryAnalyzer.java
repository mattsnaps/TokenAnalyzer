package java112.analyzer;
import java.util.*;
import java.io.*;

/**
 *
 * @author mbpriebe
 */

public class FileSummaryAnalyzer implements TokenAnalyzer {

    private int totalTokenCount = 0;
    /**
     * [getTotalTokenCount description]
     * @return [description]
     */
    public int getTotalTokenCount() {
        return totalTokenCount;
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
