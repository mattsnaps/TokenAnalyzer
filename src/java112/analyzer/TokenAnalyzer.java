package java112.analyzer;
import java.util.*;
import java.io.*;

/**
 *
 * @author mbpriebe
 */
public interface TokenAnalyzer {
    /**
     * [processToken description]
     * @param token [description]
     */
    void processToken(String token);
    /**
     * [generateOutputFile description]
     * @param inputFilePath  [description]
     * @param outputFilePath [description]
     */
    void generateOutputFile(String inputFilePath, String outputFilePath);
}
