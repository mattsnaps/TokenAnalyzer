package java112.analyzer;
import java.util.*;
import java.io.*;

/**
 *
 * @author mbpriebe
 */

public class FileAnalysis {
    ///check coding standards
    final static int VALID_ARGS = 1;

    private FileSummaryAnalyzer summaryAnalyzer;
    private DistinctTokensAnalyzer distinctAnalyzer;

    /**
     * [analyze description]
     * @param arguments [description]
     */
    public void analyze(String[] arguments) {
        if (arguments.length != 1) {
            System.out.println("Please enter one argument on the command line");
            return;
        } else {

            instantiateVariable();
            summaryAnalyzer.instantiateVariable();
            openFile(arguments[0]);
            int total = summaryAnalyzer.getTotalTokensCount();
            //System.out.println(total);
            distinctAnalyzer.generateOutputFile("something", "something");

            for (String word : distinctAnalyzer.getDistinctTokens()) {
                System.out.println(word);
            }
        }
    }

    public void instantiateVariable() {
        summaryAnalyzer = new FileSummaryAnalyzer();
        distinctAnalyzer = new DistinctTokensAnalyzer();
    }
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
     * [readFileToList description]
     * @param  input       [description]
     * @throws IOException [description]
     */
    public void readFileToList(BufferedReader input) throws IOException {
        String inputLine = null;
        String[] tokenArray = null;
        ArrayList<String> tokenArrayList = new ArrayList<String>();

        while (input.ready()) {
            inputLine = input.readLine();
            System.out.println(inputLine);
            tokenArray = inputLine.split("\\W");

            for (String word : tokenArray) {
                tokenArrayList.add(word);
            }
        }

        passToProcessToken(tokenArrayList);
    }
    public void passToProcessToken(ArrayList<String> tokenArrayList) {

        for (String token : tokenArrayList) {
            summaryAnalyzer.processToken(token);
            distinctAnalyzer.processToken(token);
        }
    }
    public void writeOutputFiles(String file) {

    }
}
