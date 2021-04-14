package java112.analyzer;
import java.util.*;

/**
 *
 * @author mbpriebe
 */
public class TokenLocationSearchAnalyzer implements TokenAnalyzer {
    private Map<String, List<Integer>> foundLocations;
    private Properties properties;
    private int currentTokenLocation;

    /**
     * [getFoundLocations description]
     * @return [description]
     */
    public Map<String, List<Integer>> getFoundLocations() {
        return foundLocations;
    }
    /**
     * [processToken description]
     * @param token [description]
     */
    public void processToken(String token) {

    }

    /**
     * [generateOutputFile description]
     * @param inputFilePath [description]
     */
    public void generateOutputFile(String inputFilePath) {

    }
}
