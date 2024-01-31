package Challenge;

import java.util.Scanner;

public class oepnz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            int dayNumber = scanner.nextInt();
            if(dayNumber>0){
                System.out.print("Its a Positive number ");
            }else if(dayNumber==0){
                System.out.print("Its the number Zero ");
            }
            else{
                System.out.print("Its a Negative number ");
            }
            if(dayNumber%2==0){
                System.out.print(", also an Even number");
            }else{
                System.out.print(", also an Odd number");
            }
            
        } else {System.out.println("Invalid input... no char pls. ");
        }
        scanner.close();
    }
}