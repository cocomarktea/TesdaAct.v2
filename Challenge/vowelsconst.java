package Challenge;
import java.util.Scanner;
public class vowelsconst {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char charr = scann.next().charAt(0);
        switch(charr){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
            System.out.println("the charater is a vowel.");
            break;
            default:
            System.out.println("the charater is a constant.");
            break;
        }
        scann.close();
    }
}
