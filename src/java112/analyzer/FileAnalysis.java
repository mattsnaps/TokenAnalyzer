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
            summaryAnalyzer = new FileSummaryAnalyzer();
            distinctAnalyzer = new DistinctTokenAnalyzer();
        }
    }
}
