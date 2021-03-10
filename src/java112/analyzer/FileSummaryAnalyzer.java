package java112.analyzer;
import java.util.*;
import java.io.*;
import java.net.URI;
import java.text.SimpleDateFormat;

/**
 *Summary analysis class that summarizes the file and output a summary report.
 * @author mbpriebe
 */

public class FileSummaryAnalyzer implements TokenAnalyzer {

    private int totalTokenCount = 0;
    private Properties properties;

    /**
     * [FileSummaryAnalyzer description]
     */
    public FileSummaryAnalyzer() {

    }

    /**
     * [FileSummaryAnalyzer description]
     * @param properties [description]
     */
    public FileSummaryAnalyzer(Properties properties) {
        this();
        this.properties = properties;
    }

    /**
     * getter method. returns total Tokens.
     * @return total token coutn.
     */
    public int getTotalTokensCount() {
        return totalTokenCount;
    }

    /**
     * Counts the total tokens (words) passed to it.
     * @param token [description]
     */
    public void processToken(String token) {
        //System.out.println(token);
        totalTokenCount++;
    }

    /**
     * Generates the summary outputfile.
     *
     * @param inputFilePath  input file path
     * @param outputFilePath output file path.
     */
    public void generateOutputFile(String inputFilePath) {
        Date date = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM d HH:mm:ss z Y");

        File file = new File(inputFilePath);
        URI fileUri = file.toURI();

        String lastModified = dateFormat.format(file.lastModified());
        long fileSize = file.length();

        String applicationName = properties.getProperty("application.name");
        String authorName = properties.getProperty("author");
        String authorEmail = properties.getProperty("author.email.address");
        String outputFilePath = properties.getProperty("output.directory")
                + properties.getProperty("summary.txt");

        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(outputFilePath)))) {
            writer.println("Application Name: " + applicationName);
            writer.println("Author Name: " + authorName);
            writer.println("Author Email: "+ authorEmail);
            writer.println("File: " + inputFilePath);
            writer.println("Date of analysis: " + date);
            writer.println("Last Modified: " + lastModified);
            writer.println("File Size: "+ fileSize);
            writer.println("File URI: "+ fileUri);
            writer.println("Total Token Count: " + totalTokenCount);

        } catch (IOException iOException) {
            System.out.println("Write Summary File Error...");
            iOException.printStackTrace();
        } catch (Exception exception) {
            System.out.println("Other Problem with Distint File...");
            exception.printStackTrace();
        }
    }
}
