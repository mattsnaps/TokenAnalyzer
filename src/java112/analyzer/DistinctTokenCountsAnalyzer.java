package java112.analyzer;
import java.util.*;
import java.io.*;

/**
 *
 * @author mbpriebe
 */

public class DistinctTokenCountsAnalyzer implements TokenAnalyzer{

    private Properties properties;
    private Map<String, Integer> distinctTokenCounts;

    /**
     * [DistinctTokenCountAnalyzer description]
     */
    public DistinctTokenCountsAnalyzer() {

    }

    /**
     * [DistinctTokensAnalyzer description]
     * @param properties [description]
     */
    public DistinctTokenCountsAnalyzer(Properties properties) {
        this();
        this.properties = properties;
    }

    /**
     * [getDistinctTokenCounts description]
     * @return [description]
     */
    public Map <String, Integer> getDistinctTokenCounts() {
        return distinctTokenCounts;
    }

    public void processToken(String token) {

    }

    public void generateOutputFile(String inputFilePath) {

    }
}
