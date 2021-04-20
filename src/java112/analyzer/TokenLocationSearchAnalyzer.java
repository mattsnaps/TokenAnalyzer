package java112.analyzer;
import java.util.*;
import java.io.*;
import java112.utilities.*;

/**
 *This class searches the token file and generates a file that lists the
 *location of the found tokens.,
 * @author mbpriebe
 */
public class TokenLocationSearchAnalyzer implements TokenAnalyzer {
    private Map<String, List<Integer>> foundLocations;
    private Properties properties;
    private int currentTokenLocation;

    /**
     * Constructor Class.
     */
    public TokenLocationSearchAnalyzer() {
        foundLocations = new TreeMap<String, List<Integer>>();
        currentTokenLocation = 1;
    }

    /**
     * Constructor class
     * @param properties properties file.
     */
    public TokenLocationSearchAnalyzer(Properties properties) {
        this();
        this.properties = properties;
        searchTokensFile();
    }

    /**
     * get for testing purposes.
     * @return foundlocations.
     */
    public Map<String, List<Integer>> getFoundLocations() {
        return foundLocations;
    }

    /**
     * gets the search token file and passes it to readSearch tokens method.
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
     * reads the search token list and addes it to the MAP.
     * @param input words we are going to search for.
     * @throws IOException IO exception
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
     * adds the token location to the list.
     * @param token token.
     */
     public void processToken(String token) {
         for (Map.Entry<String, List<Integer>> entry : foundLocations.entrySet()) {
             if (token.equals(entry.getKey())) {

                List<Integer> list = entry.getValue();

                list.add(currentTokenLocation);
            }
        }

        currentTokenLocation++;
    }

    /**
     * Generates the output file and also formats it to specifications.
     * @param inputFilePath Where the file is coming from.
     */
    public void generateOutputFile(String inputFilePath) {
        int firstRun = 0;


        String outputFilePath = properties.getProperty("output.directory") +
                properties.getProperty("output.file.token.search.locations");

        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(outputFilePath)))) {
            //writer.println(distinctTokens.size());
            for (Map.Entry<String, List<Integer>> entry : foundLocations.entrySet()) {

                String key = entry.getKey();

                List<Integer> list = entry.getValue();
                int counter = 0;


                int last;
                int first;

                if (firstRun == 0) {
                    writer.println(key + " =");
                    firstRun++;
                } else {
                    writer.print("\n\n");
                    writer.println(key + " =");
                }


                if (!list.isEmpty()) {
                    last = list.get(list.size() - 1);
                    first = list.get(0);
                } else {
                    last = -1;
                    first = -1;
                    writer.print("[]");
                }


                for (int location : list) {

                    counter = counter + Integer.toString(location).length() + 2;

                    if (counter > 79 && location != first) {
                        counter = 0;
                    }
                    if (location == first) {
                        writer.print("[" + location + ", ");
                    }

                    if (counter == 0 && location != first) {
                        writer.println(location);
                    }

                    if ((counter > 0) && (location != first) && (location != last)) {
                        writer.print(location + ", ");
                    }

                    if (location == last) {
                        writer.print(location + "]");
                    }
                }
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
