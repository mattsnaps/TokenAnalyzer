package java112.analyzer;
import java.util.*;
import java.io.*;
import java112.utilities.*;

/**
 *Main control class for the File Analysis.
 * @author mbpriebe
 */

public class FileAnalysis implements PropertiesLoader {
    ///check coding standards
    final static int VALID_ARGS = 2;

    private List<TokenAnalyzer> analyzers;

    /**
     * Main controller method that calls all other methods necessary to analyze and output reports.
     * calls method to instantiate .
     * send to openFile Method.
     * determines the input and output file path and passes to writeOutputFiles methods.
     * @param arguments name of file to be analyzed
     */
    public void analyze(String[] arguments) {
        if (arguments.length != VALID_ARGS) {
            System.out.println("Please enter one argument on the command line");

        } else {

            Properties properties = new Properties();
            properties = loadProperties(arguments[1]);

            instantiateVariable();

            //issue 1 - New Method?
            analyzers.add(new FileSummaryAnalyzer(properties));
            analyzers.add(new DistinctTokensAnalyzer(properties));

            openFile(arguments[0]);

            File file = new File(arguments[0]);

            writeOutputFiles(file.getAbsolutePath());
        }
    }

    /**
     * Instantiates the summaryAnalyzer and distinctAnlayzer.
     */
    public void instantiateVariable() {
        analyzers = new ArrayList<TokenAnalyzer>();
    }

    /**
     * Opens file and passes input to reader method.
     * handles exceptions.
     * @param fileName name of the file to me analyzed.
     */
    public void openFile(String fileName) {
        try (BufferedReader input = new BufferedReader(new FileReader(fileName))) {
            readFileToList(input);

        } catch (FileNotFoundException fileNotFound) {
            System.out.println("File not Found...");
            fileNotFound.printStackTrace();
        } catch (IOException iOException) {
            System.out.println("Failed to read file...");
            iOException.printStackTrace();
        } catch (Exception exception) {
            System.out.println("Some Other Problem...");
            exception.printStackTrace();
        }
    }

    /**
     * Reads the file and prints the file contests to an ArrayList.
     * Passes the ArrayList to passToProcessToken Method.
     * @param  input  the file input.
     * @throws IOException throws exception back to openFile method.
     */
     public void readFileToList(BufferedReader input) throws IOException {
         String inputLine = null;
         String[] tokenArray = null;

         while (input.ready()) {
             inputLine = input.readLine();
             //System.out.println(inputLine);

             tokenArray = inputLine.split("\\W");

             for (String word : tokenArray) {
                 passToProcessToken(word);
             }
         }
     }

    /**
     * Passes the Arraylist to the analyzer classes.
     * specifically to the processToken method in AnalyzerClass.
     * @param tokenArrayList [description]
     */
     public void passToProcessToken(String token) {

        if (!(token.equals(""))) {
            for (TokenAnalyzer item : analyzers) {
                item.processToken(token);
            }
    }

    }
    /**
     * Accepts the input and output file paths. Passes to Analyzerclasses generateOutputFile Methods.
     * @param inputPath input File Path
     */
    public void writeOutputFiles(String inputPath) {

        for (TokenAnalyzer item : analyzers) {

            item.generateOutputFile(inputPath);
        }


        //distinctAnalyzer.generateOutputFile(inputPath);
        //summaryAnalyzer.generateOutputFile(inputPath);
    }
}
