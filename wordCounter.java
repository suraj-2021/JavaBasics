import java.io.*;
import java.util.StringTokenizer;

public class WordsCounter {
    public static void main(String[] args) {
        int file1_words = 0;
        int file2_words = 0;

        
        try (BufferedReader file1 = new BufferedReader(new FileReader("file1.txt"))) {
            String line;
            while ((line = file1.readLine()) != null) {
                StringTokenizer words = new StringTokenizer(line);
                file1_words += words.countTokens();
            }
        } catch (IOException e) {
            System.out.println("Error reading file1.txt: " + e.getMessage());
        }

        
        try (BufferedReader file2 = new BufferedReader(new FileReader("file2.txt"))) {
            String line;
            while ((line = file2.readLine()) != null) {
                StringTokenizer words = new StringTokenizer(line);
                file2_words += words.countTokens();
            }
        } catch (IOException e) {
            System.out.println("Error reading file2.txt: " + e.getMessage());
        }

        System.out.println("File1 Total words: " + file1_words);
        System.out.println("File2 Total words: " + file2_words);
    }
}
