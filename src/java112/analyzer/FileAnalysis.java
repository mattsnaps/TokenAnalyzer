package java112.analyzer;
import java.util.*;
import java.io.*;

/**
 *
 * @author mbpriebe
 */

public class FileAnalysis {
    ///check coding standards
    final int validArgs = 1;
    private FileSummaryAnalyzer summaryAnalyzer;
    private DistinctTokenAnalyzer distinctAnalyzer;
    /**
     * [analyze description]
     * @param arguments [description]
     */
    public void analyze(String[] arguments) {
        if (arguments.length != validArgs) {
            System.out.println("Please enter one argument on the command line");
        } else {
            instanceVariable();
            openFile(arguments[0]);
        }
    }

    public void instanceVariable() {
        summaryAnalyzer = new FileSummaryAnalyzer();
        distinctAnalyzer = new DistinctTokenAnalyzer();
    }
    public void openFile(String fileName) {
        try (BufferedReader input = new BufferedReader(new FileReader(fileName))) {
            while (input.ready()) {
                String line = input.readLine();
                loopFile(line);
                setLoop(line);
            }
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
    public void loopFile(String line) {
        List<String> myList = new ArrayList<String>();
        String[] splitLine = line.split("\\w");

        for (String token : splitLine) {
            myList.add(token);
        }

    }
    public void setLoop(String line) {
        Set<String> setList = new TreeSet<String>();
        String[] splitLine = line.split("\\w");

        for (String token : splitLine) {
            setList.add(token);
        }

    }
    public void passToProcessToken() {

    }
    public void writeOutputFiles() {

    }
}
