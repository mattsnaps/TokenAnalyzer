package java112.analyzer;
import java.util.*;
import java.io.*;

/**
 *interface for for Analyzer classes.
 * @author mbpriebe
 */
public interface TokenAnalyzer {
    /**
     * process the tokens in filr.
     * @param token word in file.
     */
    void processToken(String token);
    /**
     * generates the output file.
     * @param inputFilePath  input file path
     * @param outputFilePath outputfile path
     */
    void generateOutputFile(String inputFilePath, String outputFilePath);
}
