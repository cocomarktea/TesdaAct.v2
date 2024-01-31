package Challenge;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        boolean yesyo = true;
        System.out.print("===============================\n\tWELCOME USER!\n");
        while(yesyo!=false){
            StringBuilder sb = new StringBuilder();
            System.out.print("===============================\nYour 1st input: ");
            String mypers = myObj.nextLine();
            sb.append(mypers);
            System.out.print("Your 2nd input: ");
            String mySec = myObj.nextLine();
            sb.append(mySec);
            String myStr = sb.toString();
            String pali = sb.reverse().toString();
            System.out.print("Your combined input is: "+myStr+"\n");
            if(pali.equalsIgnoreCase(myStr)){
                System.out.print("Your input is considered Palindrome! Congrats! \n");
                yesyo=false;
            }else {
                System.out.print("Your input is not considered Palindrome! try again..\n");
            }
        }
    }
}