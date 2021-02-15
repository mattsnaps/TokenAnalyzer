package java112.analyzer;
import java.util.*;
import java.io.*;

/**
 *Main control class for the File Analysis.
 * @author mbpriebe
 */

public class FileAnalysis {
    ///check coding standards
    final static int VALID_ARGS = 1;

    private FileSummaryAnalyzer summaryAnalyzer;
    private DistinctTokensAnalyzer distinctAnalyzer;

    /**
     * Main controller method that calls all other methods necessary to analyze and output reports.
     * calls method to instantiate .
     * send to openFile Method.
     * determines the input and output file path and passes to writeOutputFiles methods.
     * @param arguments name of file to be analyzed
     */
    public void analyze(String[] arguments) {
        if (arguments.length != 1) {
            System.out.println("Please enter one argument on the command line");
            return;
        } else {
            instantiateVariable();
            openFile(arguments[0]);
            File file = new File(arguments[0]);
            writeOutputFiles(file.getAbsolutePath());
        }
    }

    /**
     * Instantiates the summaryAnalyzer and distinctAnlayzer.
     */
    public void instantiateVariable() {
        summaryAnalyzer = new FileSummaryAnalyzer();
        distinctAnalyzer = new DistinctTokensAnalyzer();
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
        ArrayList<String> tokenArrayList = new ArrayList<String>();

        while (input.ready()) {
            inputLine = input.readLine();
            //System.out.println(inputLine);

            tokenArray = inputLine.split("\\W");

            for (String word : tokenArray) {
                tokenArrayList.add(word);
            }
        }

        passToProcessToken(tokenArrayList);
    }

    /**
     * Passes the Arraylist to the analyzer classes.
     * specifically to the processToken method in AnalyzerClass.
     * @param tokenArrayList [description]
     */
    public void passToProcessToken(ArrayList<String> tokenArrayList) {

        for (String token : tokenArrayList) {
            distinctAnalyzer.processToken(token);
            if (!(token.equals(""))) {
                summaryAnalyzer.processToken(token);
            }
        }
    }
    /**
     * Accepts the input and output file paths. Passes to Analyzerclasses generateOutputFile Methods.
     * @param inputPath input File Path
     */
    public void writeOutputFiles(String inputPath) {

        String distinctOutputPath = "output/distinct_tokens.txt";
        String summaryOutputPath = "output/summary.txt";

        distinctAnalyzer.generateOutputFile(inputPath, distinctOutputPath);
        summaryAnalyzer.generateOutputFile(inputPath, summaryOutputPath);
    }
}
