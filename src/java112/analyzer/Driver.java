package java112.analyzer;

/**
 *Launcher main method class. Calls Analyze method in FileAnalysisClass
 * @author mbpriebe
 */

public class Driver {
    /**
     * [main description]
     * @param args [description]
     */
    public static void main(String[] args) {
        FileAnalysis driver = new FileAnalysis();
        driver.analyze(args);
    }
}
