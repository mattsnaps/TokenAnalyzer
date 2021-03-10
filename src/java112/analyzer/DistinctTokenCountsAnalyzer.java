package java112.analyzer;
import java.util.*;
import java.io.*;

/**
 *
 * @author mbpriebe
 */

public class DistinctTokenCountAnalyzer {

    private Properties properties;
    private Map<String, Integer> distinctTokenCounts;

    /**
     * [getDistinctTokenCounts description]
     * @return [description]
     */
    public Map <String, Integer> getDistinctTokenCounts() {
        return distinctTokenCounts;
    }
}
