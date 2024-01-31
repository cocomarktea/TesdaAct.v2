package Challenge;
import java.util.Scanner;
public class countWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        int wordCount = sentence.split("\\s+").length;
        System.out.println("The number of words in the sentence is: " + wordCount);
    }
}
