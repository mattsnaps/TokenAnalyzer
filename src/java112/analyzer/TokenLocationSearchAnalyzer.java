package java112.analyzer;
import java.util.*;
import java.io.*;
import java112.utilities.*;

/**
 *
 * @author mbpriebe
 */
public class TokenLocationSearchAnalyzer implements TokenAnalyzer {
    private Map<String, List<Integer>> foundLocations;
    private Properties properties;
    private int currentTokenLocation;

    /**
     * [TokenLocationSearchAnalyzer description]
     */
    public TokenLocationSearchAnalyzer() {
        foundLocations = new TreeMap<String, List<Integer>>();
        currentTokenLocation = 1;
    }

    /**
     * [TokenLocationSearchAnalyzer description]
     * @param properties [description]
     */
    public TokenLocationSearchAnalyzer(Properties properties) {
        this();
        this.properties = properties;
        searchTokensFile();
    }

    /**
     * [getFoundLocations description]
     * @return [description]
     */
    public Map<String, List<Integer>> getFoundLocations() {
        return foundLocations;
    }

    /**
     * [readSearchTokens description]
     */
    public void searchTokensFile() {
        String searchTokenFile = properties.getProperty("classpath.search.tokens");

        try (
            InputStream inputStream = this.getClass().getResourceAsStream(searchTokenFile);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader searchTokensReader = new BufferedReader(inputStreamReader)) {
                readSearchTokens(searchTokensReader);
        } catch (IOException inputOutputException) {
            System.out.println("IO Exception");
            inputOutputException.printStackTrace();
        } catch (Exception exception) {
            System.out.println("Other Problem");
            exception.printStackTrace();
        }
    }

    /**
     * [readSearchTokens description]
     * @param searchTokenReader [description]
     */
    public void readSearchTokens(BufferedReader input) throws IOException {

        String inputLine = null;

        while (input.ready()) {
            inputLine = input.readLine().trim();

            List<Integer> list = new ArrayList<Integer>();

            if (inputLine.equals("")){

            } else {
                foundLocations.put(inputLine, list);
            }
        }
    }

    /**
     * [processToken description]
     * @param token [description]
     */
     public void processToken(String token) {
         for (Map.Entry<String, List<Integer>> entry : foundLocations.entrySet()) {
             if (token.equals(entry.getKey())) {

                entry.getValue().add(currentTokenLocation);
            }
        }

        currentTokenLocation++;
    }

    /**
     * [generateOutputFile description]
     * @param inputFilePath [description]
     */
    public void generateOutputFile(String inputFilePath) {

        String outputFilePath = properties.getProperty("output.directory") +
                properties.getProperty("output.file.token.search.locations");

        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(outputFilePath)))) {
            //writer.println(distinctTokens.size());
            for (Map.Entry<String, List<Integer>> entry : foundLocations.entrySet()) {
                String key = entry.getKey() + " =";
                List<Integer> list = entry.getValue();

                writer.println(key);
                writer.println(list);
            }
        } catch (IOException iOException) {
            System.out.println("Write Largest Token File Error...");
            iOException.printStackTrace();
        } catch (Exception exception) {
            System.out.println("Other Problem with Largest Token File...");
            exception.printStackTrace();
        }
    }
}
