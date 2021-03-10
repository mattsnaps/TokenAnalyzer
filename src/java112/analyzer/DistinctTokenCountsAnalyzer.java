package java112.analyzer;
import java.util.*;
import java.io.*;

/**
 *
 * @author mbpriebe
 */

public class DistinctTokenCountsAnalyzer implements TokenAnalyzer{

    private Properties properties;
    private Map<String, Integer> distinctTokenCounts = new TreeMap<String, Integer>();

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

        if (!distinctTokenCounts.containsKey(token)) {
            distinctTokenCounts.put(token, 1);
        } else {
            distinctTokenCounts.put(token, distinctTokenCounts.get(token) + 1);
        }
    }

    public void generateOutputFile(String inputFilePath) {

        String outputFilePath = properties.getProperty("output.directory") +
                properties.getProperty("output.file.distinct.counts");

        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(outputFilePath)))) {
            //writer.println(distinctTokens.size());
            for (Map.Entry<String, Integer> entry : distinctTokenCounts.entrySet()) {
                writer.println(entry.getKey() + "\t" + entry.getValue());
            }
        } catch (IOException iOException) {
            System.out.println("Write Distinct Count File Error...");
            iOException.printStackTrace();
        } catch (Exception exception) {
            System.out.println("Other Problem with Distint Count File...");
            exception.printStackTrace();
        }
    }
}
