package java112.analyzer;
import java.util.*;
import java.io.*;
import java.net.URI;
import java.text.SimpleDateFormat;

/**
 *
 * @author mbpriebe
 */

public class FileSummaryAnalyzer implements TokenAnalyzer {

    private int totalTokenCount = 0;
    /**
     * [getTotalTokenCount description]
     * @return [description]
     */
    public int getTotalTokensCount() {
        return totalTokenCount;
    }

    /**
     * [processToken description]
     * @param token [description]
     */
    public void processToken(String token) {
        //System.out.println(token);
        totalTokenCount++;
    }

    /**
     * [generateOutputFile description]
     * @param inputFilePath  [description]
     * @param outputFilePath [description]
     */
    public void generateOutputFile(String inputFilePath, String outputFilePath) {
        Date date = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM d HH:mm:ss z Y");

        File file = new File(inputFilePath);
        URI fileUri = file.toURI();


        String lastModified = dateFormat.format(file.lastModified());
        long fileSize = file.length();
        String outputName = "summary.txt";
        String applicationName = "File Magic";
        String authorName = "Matthew Priebe";
        String authorEmail = "mbpriebe@madisoncollege.edu";

        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(outputFilePath + outputName)))) {
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
