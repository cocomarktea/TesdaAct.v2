package Challenge;
import java.util.Scanner;
public class stringMethods {
    public static void main(String[] args) {
        System.out.print("WELCOME USER!\nPlease input some string: ");
        Scanner myObj = new Scanner(System.in);
        String myInput = myObj.nextLine();
        System.out.println("You input: "+myInput);
        int len1 = myInput.length();
        String uCase = myInput.toUpperCase();
        String lCase = myInput.toLowerCase();
        char pers = myInput.charAt(0);
        char last = myInput.charAt(len1-1);
        System.out.print("=========================\n1. Length: "+len1);
        System.out.print("\n2. uppercase     : "+uCase);
        System.out.print("\n3. lowercase     : "+lCase);
        System.out.print("\n4. first char    : "+pers);
        System.out.print("\n5. last char     : "+last+"\n");
        System.out.println("6. Substring(2,5): "+myInput.substring(2,5));
        myObj.close();
    }
}