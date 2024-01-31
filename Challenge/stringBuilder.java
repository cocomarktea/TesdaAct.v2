package Challenge;
import java.util.Scanner;

public class stringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string of at least 10 characters: ");
        String sampuLetra = scanner.nextLine();

        if (sampuLetra.length() < 10) {
            System.out.println("Invalid. please enter atlease 10 character.");
            scanner.close();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(sampuLetra);

        System.out.println("Length of the string: " + stringBuilder.length());
        System.out.println("First character: " + stringBuilder.charAt(0));
        System.out.println("Last character: " + stringBuilder.charAt(stringBuilder.length() - 1));
        System.out.println("Index of 'a': " + stringBuilder.indexOf("a"));
        System.out.println("Substring from index 3 to 6: " + stringBuilder.substring(3, 7));
        stringBuilder.append("123");
        System.out.println("After appending '123': " + stringBuilder);
        stringBuilder.insert(4, "xyz");
        System.out.println("After inserting 'xyz' at index 4: " + stringBuilder);
        stringBuilder.delete(2, 5);
        System.out.println("After deleting substring from index 2 to 4: " + stringBuilder);
        stringBuilder.deleteCharAt(8);
        System.out.println("After deleting character at index 8: " + stringBuilder);
        stringBuilder.reverse();
        System.out.println("After reversing: " + stringBuilder);
        scanner.close();
    }
}
