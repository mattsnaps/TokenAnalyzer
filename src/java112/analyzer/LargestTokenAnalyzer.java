package java112.analyzer;
import java.util.*;
import java.io.*;

/**
 *
 * @author mbpriebe
 */

public class LargestTokenAnalyzer implements TokenAnalyzer{

    private Properties properties;
    private Set<String> largestToken;
    private int minimumTokenLength;

    /**
     * [LargestTokenAnalyzer description]
     */
    public LargestTokenAnalyzer() {

    }
    /**
     * [LargestTokenAnalyzer description]
     * @param properties [description]
     */
    public LargestTokenAnalyzer(Properties properties) {
        this();
        this.properties = properties;
    }

    /**
     * [getLargestToken description]
     * @return [description]
     */
    public Set<String> getLargestToken() {
        return largestTokens;
    }

    public void processToken(String token) {

    }

    public void generateOutputFile(String inputFilePath) {

    }
}
